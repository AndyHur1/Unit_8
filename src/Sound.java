public class Sound {

    /** the array of values in this sound; guaranteed not to be null */
    private int[] samples;

    /** constructor created for testing purposes
     * Not part of original problem
     */
    public Sound(int[] samples) {
        this.samples = samples;
    }

    /** Changes those values in this sound that have an amplitude greater than limit.
     * Values greater than limit are changed to limit.
     * Values less than -limit are chhanged to -limit.
     * @param limit the amplitude limit
     *              Precondition limit >= 0
     * @return the number of values in this sound that this method changed.
     */
    public int limitAmplitude(int limit) {
        int Changes = 0;

        for (int i = 0; i < this.samples.length; i++) {
            if (samples[i]>limit) {
                samples[i]=limit;
                Changes++;
            } else if (samples[i] < limit*-1) {
                samples[i] = limit*-1;
                Changes++;
            }
        }
        return Changes;

    }

    /**
     * Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0;
     * Precodition: samples contains at least one nonzero value
     * Postcondition: the length of samples reflects the removal of starting silence
     */
    public void trimSilenceFromBeginning() {
        if (samples[0] == 0) {
            int times = 0;
            for (int num : samples) {
                if (num!= 0)
                {
                    break;}
                else
                    {
                    times++;
                }
            }
            int[] arr = new int[samples.length-times];
            for (int x = 0; x < arr.length; x++) {
                arr[x] = samples[times];
                times++;
                if (samples.length==times)
                    break;
            }


            samples = arr;


        }
    }

    /** accessor method used for testing purposes - Not part of original program */
    public int[] getSamples() {
        return samples;
    }
}
