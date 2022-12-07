package fr.efrei.domain;

public class Job {
    private String title;
    private String positionCode;
    private boolean statue;


    public Job(Builder builder) {
        this.title = builder.title;
        this.positionCode = builder.positionCode;
        this.statue = builder.statue;
    }

    public String getTitle() {
        return title;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public boolean isStatue() {
        return statue;
    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", positionCode='" + positionCode + '\'' +
                ", statue=" + statue +
                '}';
    }

    public static class Builder {
        private String title;
        private String positionCode;
        private boolean statue;


        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setPositionCode(String positionCode) {
            this.positionCode = positionCode;
            return this;
        }

        public Builder setStatue(boolean statue) {
            this.statue = statue;
            return this;
        }
        public Builder copy (Job job){

            this.title = job.title;
            this.positionCode = job.positionCode;
            this.statue = job.statue;
            return this;

        }
        public Job build(){
            return new Job(this);
        }
    }



}
