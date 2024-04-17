package com.withings.library.sleep;

import kotlin.Metadata;
/* compiled from: SleepLib.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b/\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\b¨\u00063"}, d2 = {"Lcom/withings/library/sleep/SleepScoreGenericConstants;", "", "()V", "averageThreshold", "", "getAverageThreshold", "()I", "setAverageThreshold", "(I)V", "errorUnboundedScore", "getErrorUnboundedScore", "setErrorUnboundedScore", "goodThreshold", "getGoodThreshold", "setGoodThreshold", "maximumScore", "getMaximumScore", "setMaximumScore", "minimumScore", "getMinimumScore", "setMinimumScore", "noError", "getNoError", "setNoError", "perfectThreshold", "getPerfectThreshold", "setPerfectThreshold", "scoreUnknown", "getScoreUnknown", "setScoreUnknown", "statusAverage", "getStatusAverage", "setStatusAverage", "statusBad", "getStatusBad", "setStatusBad", "statusError", "getStatusError", "setStatusError", "statusGood", "getStatusGood", "setStatusGood", "statusPerfect", "getStatusPerfect", "setStatusPerfect", "statusUnknown", "getStatusUnknown", "setStatusUnknown", "version", "getVersion", "setVersion", "sleep-lib_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class SleepScoreGenericConstants {
    private int averageThreshold;
    private int errorUnboundedScore;
    private int goodThreshold;
    private int maximumScore;
    private int minimumScore;
    private int noError;
    private int perfectThreshold;
    private int scoreUnknown;
    private int statusAverage;
    private int statusBad;
    private int statusError;
    private int statusGood;
    private int statusPerfect;
    private int statusUnknown;
    private int version;

    public final int getAverageThreshold() {
        return this.averageThreshold;
    }

    public final int getErrorUnboundedScore() {
        return this.errorUnboundedScore;
    }

    public final int getGoodThreshold() {
        return this.goodThreshold;
    }

    public final int getMaximumScore() {
        return this.maximumScore;
    }

    public final int getMinimumScore() {
        return this.minimumScore;
    }

    public final int getNoError() {
        return this.noError;
    }

    public final int getPerfectThreshold() {
        return this.perfectThreshold;
    }

    public final int getScoreUnknown() {
        return this.scoreUnknown;
    }

    public final int getStatusAverage() {
        return this.statusAverage;
    }

    public final int getStatusBad() {
        return this.statusBad;
    }

    public final int getStatusError() {
        return this.statusError;
    }

    public final int getStatusGood() {
        return this.statusGood;
    }

    public final int getStatusPerfect() {
        return this.statusPerfect;
    }

    public final int getStatusUnknown() {
        return this.statusUnknown;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setAverageThreshold(int i11) {
        this.averageThreshold = i11;
    }

    public final void setErrorUnboundedScore(int i11) {
        this.errorUnboundedScore = i11;
    }

    public final void setGoodThreshold(int i11) {
        this.goodThreshold = i11;
    }

    public final void setMaximumScore(int i11) {
        this.maximumScore = i11;
    }

    public final void setMinimumScore(int i11) {
        this.minimumScore = i11;
    }

    public final void setNoError(int i11) {
        this.noError = i11;
    }

    public final void setPerfectThreshold(int i11) {
        this.perfectThreshold = i11;
    }

    public final void setScoreUnknown(int i11) {
        this.scoreUnknown = i11;
    }

    public final void setStatusAverage(int i11) {
        this.statusAverage = i11;
    }

    public final void setStatusBad(int i11) {
        this.statusBad = i11;
    }

    public final void setStatusError(int i11) {
        this.statusError = i11;
    }

    public final void setStatusGood(int i11) {
        this.statusGood = i11;
    }

    public final void setStatusPerfect(int i11) {
        this.statusPerfect = i11;
    }

    public final void setStatusUnknown(int i11) {
        this.statusUnknown = i11;
    }

    public final void setVersion(int i11) {
        this.version = i11;
    }
}
