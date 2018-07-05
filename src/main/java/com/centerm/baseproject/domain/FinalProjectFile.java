package com.centerm.baseproject.domain;

public class FinalProjectFile {

    private String finalProjectId;

    private String voiceFilePath;

    public FinalProjectFile() {

    }

    public FinalProjectFile(String finalProjectId, String voiceFilePath) {
        this.finalProjectId = finalProjectId;
        this.voiceFilePath = voiceFilePath;
    }

    public String getFinalProjectId() {
        return finalProjectId;
    }

    public void setFinalProjectId(String finalProjectId) {
        this.finalProjectId = finalProjectId;
    }

    public String getVoiceFilePath() {
        return voiceFilePath;
    }

    public void setVoiceFilePath(String voiceFilePath) {
        this.voiceFilePath = voiceFilePath;
    }
}
