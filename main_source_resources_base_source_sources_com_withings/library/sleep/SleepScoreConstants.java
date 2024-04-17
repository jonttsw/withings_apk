package com.withings.library.sleep;

import kotlin.Metadata;
/* compiled from: SleepLib.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\\\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 R\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R\u001a\u00103\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001e\"\u0004\bA\u0010 R\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001a\u0010E\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001e\"\u0004\bG\u0010 R\u001a\u0010H\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001a\u0010K\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001a\u0010N\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001a\u0010Q\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u001e\"\u0004\bS\u0010 R\u001a\u0010T\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001a\u0010W\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001a\u0010Z\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\bR\u001a\u0010]\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u001e\"\u0004\b_\u0010 R\u001a\u0010`\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010\bR\u001a\u0010c\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u001e\"\u0004\be\u0010 R\u001a\u0010f\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u001e\"\u0004\bh\u0010 R\u001a\u0010i\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u001e\"\u0004\bk\u0010 R\u001a\u0010l\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u001e\"\u0004\bn\u0010 R\u001a\u0010o\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u001e\"\u0004\bq\u0010 R\u001a\u0010r\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u001e\"\u0004\bt\u0010 R\u001a\u0010u\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0006\"\u0004\bw\u0010\b¨\u0006x"}, d2 = {"Lcom/withings/library/sleep/SleepScoreConstants;", "", "()V", "averageScoreRatio", "", "getAverageScoreRatio", "()D", "setAverageScoreRatio", "(D)V", "bonusAverage", "getBonusAverage", "setBonusAverage", "bonusBad", "getBonusBad", "setBonusBad", "bonusGood", "getBonusGood", "setBonusGood", "bonusPerfect", "getBonusPerfect", "setBonusPerfect", "bonusUnknown", "getBonusUnknown", "setBonusUnknown", "durationAverageThreshold", "getDurationAverageThreshold", "setDurationAverageThreshold", "durationBadScore", "", "getDurationBadScore", "()I", "setDurationBadScore", "(I)V", "durationBadSlope", "getDurationBadSlope", "setDurationBadSlope", "durationBadThreshold", "getDurationBadThreshold", "setDurationBadThreshold", "durationGoodScore", "getDurationGoodScore", "setDurationGoodScore", "durationGoodThreshold", "getDurationGoodThreshold", "setDurationGoodThreshold", "durationMaxThreshold", "getDurationMaxThreshold", "setDurationMaxThreshold", "durationPerfectScore", "getDurationPerfectScore", "setDurationPerfectScore", "durationPerfectThreshold", "getDurationPerfectThreshold", "setDurationPerfectThreshold", "goodScoreRatio", "getGoodScoreRatio", "setGoodScoreRatio", "interruptionsAverageThreshold", "getInterruptionsAverageThreshold", "setInterruptionsAverageThreshold", "interruptionsGoodThreshold", "getInterruptionsGoodThreshold", "setInterruptionsGoodThreshold", "interruptionsMaxScore", "getInterruptionsMaxScore", "setInterruptionsMaxScore", "interruptionsPerfectThreshold", "getInterruptionsPerfectThreshold", "setInterruptionsPerfectThreshold", "minBedTimes", "getMinBedTimes", "setMinBedTimes", "perfectScoreRatio", "getPerfectScoreRatio", "setPerfectScoreRatio", "recoveryAverageThreshold", "getRecoveryAverageThreshold", "setRecoveryAverageThreshold", "recoveryGoodThreshold", "getRecoveryGoodThreshold", "setRecoveryGoodThreshold", "recoveryMaxScore", "getRecoveryMaxScore", "setRecoveryMaxScore", "recoveryPerfectThreshold", "getRecoveryPerfectThreshold", "setRecoveryPerfectThreshold", "regularityAverageThreshold", "getRegularityAverageThreshold", "setRegularityAverageThreshold", "regularityGoodThreshold", "getRegularityGoodThreshold", "setRegularityGoodThreshold", "regularityMaxScore", "getRegularityMaxScore", "setRegularityMaxScore", "regularityPerfectThreshold", "getRegularityPerfectThreshold", "setRegularityPerfectThreshold", "timeToSleepGoodScore", "getTimeToSleepGoodScore", "setTimeToSleepGoodScore", "timeToSleepGoodThreshold", "getTimeToSleepGoodThreshold", "setTimeToSleepGoodThreshold", "timeToSleepLongThreshold", "getTimeToSleepLongThreshold", "setTimeToSleepLongThreshold", "wakeupGoodScore", "getWakeupGoodScore", "setWakeupGoodScore", "wakeupGoodThreshold", "getWakeupGoodThreshold", "setWakeupGoodThreshold", "wakeupLongThreshold", "getWakeupLongThreshold", "setWakeupLongThreshold", "withoutRegularity", "getWithoutRegularity", "setWithoutRegularity", "sleep-lib_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class SleepScoreConstants {
    private double averageScoreRatio;
    private double bonusAverage;
    private double bonusBad;
    private double bonusGood;
    private double bonusPerfect;
    private double bonusUnknown;
    private double durationAverageThreshold;
    private int durationBadScore;
    private int durationBadSlope;
    private double durationBadThreshold;
    private int durationGoodScore;
    private double durationGoodThreshold;
    private double durationMaxThreshold;
    private int durationPerfectScore;
    private double durationPerfectThreshold;
    private double goodScoreRatio;
    private double interruptionsAverageThreshold;
    private double interruptionsGoodThreshold;
    private int interruptionsMaxScore;
    private double interruptionsPerfectThreshold;
    private int minBedTimes;
    private double perfectScoreRatio;
    private double recoveryAverageThreshold;
    private double recoveryGoodThreshold;
    private int recoveryMaxScore;
    private double recoveryPerfectThreshold;
    private double regularityAverageThreshold;
    private double regularityGoodThreshold;
    private int regularityMaxScore;
    private double regularityPerfectThreshold;
    private int timeToSleepGoodScore;
    private int timeToSleepGoodThreshold;
    private int timeToSleepLongThreshold;
    private int wakeupGoodScore;
    private int wakeupGoodThreshold;
    private int wakeupLongThreshold;
    private double withoutRegularity;

    public final double getAverageScoreRatio() {
        return this.averageScoreRatio;
    }

    public final double getBonusAverage() {
        return this.bonusAverage;
    }

    public final double getBonusBad() {
        return this.bonusBad;
    }

    public final double getBonusGood() {
        return this.bonusGood;
    }

    public final double getBonusPerfect() {
        return this.bonusPerfect;
    }

    public final double getBonusUnknown() {
        return this.bonusUnknown;
    }

    public final double getDurationAverageThreshold() {
        return this.durationAverageThreshold;
    }

    public final int getDurationBadScore() {
        return this.durationBadScore;
    }

    public final int getDurationBadSlope() {
        return this.durationBadSlope;
    }

    public final double getDurationBadThreshold() {
        return this.durationBadThreshold;
    }

    public final int getDurationGoodScore() {
        return this.durationGoodScore;
    }

    public final double getDurationGoodThreshold() {
        return this.durationGoodThreshold;
    }

    public final double getDurationMaxThreshold() {
        return this.durationMaxThreshold;
    }

    public final int getDurationPerfectScore() {
        return this.durationPerfectScore;
    }

    public final double getDurationPerfectThreshold() {
        return this.durationPerfectThreshold;
    }

    public final double getGoodScoreRatio() {
        return this.goodScoreRatio;
    }

    public final double getInterruptionsAverageThreshold() {
        return this.interruptionsAverageThreshold;
    }

    public final double getInterruptionsGoodThreshold() {
        return this.interruptionsGoodThreshold;
    }

    public final int getInterruptionsMaxScore() {
        return this.interruptionsMaxScore;
    }

    public final double getInterruptionsPerfectThreshold() {
        return this.interruptionsPerfectThreshold;
    }

    public final int getMinBedTimes() {
        return this.minBedTimes;
    }

    public final double getPerfectScoreRatio() {
        return this.perfectScoreRatio;
    }

    public final double getRecoveryAverageThreshold() {
        return this.recoveryAverageThreshold;
    }

    public final double getRecoveryGoodThreshold() {
        return this.recoveryGoodThreshold;
    }

    public final int getRecoveryMaxScore() {
        return this.recoveryMaxScore;
    }

    public final double getRecoveryPerfectThreshold() {
        return this.recoveryPerfectThreshold;
    }

    public final double getRegularityAverageThreshold() {
        return this.regularityAverageThreshold;
    }

    public final double getRegularityGoodThreshold() {
        return this.regularityGoodThreshold;
    }

    public final int getRegularityMaxScore() {
        return this.regularityMaxScore;
    }

    public final double getRegularityPerfectThreshold() {
        return this.regularityPerfectThreshold;
    }

    public final int getTimeToSleepGoodScore() {
        return this.timeToSleepGoodScore;
    }

    public final int getTimeToSleepGoodThreshold() {
        return this.timeToSleepGoodThreshold;
    }

    public final int getTimeToSleepLongThreshold() {
        return this.timeToSleepLongThreshold;
    }

    public final int getWakeupGoodScore() {
        return this.wakeupGoodScore;
    }

    public final int getWakeupGoodThreshold() {
        return this.wakeupGoodThreshold;
    }

    public final int getWakeupLongThreshold() {
        return this.wakeupLongThreshold;
    }

    public final double getWithoutRegularity() {
        return this.withoutRegularity;
    }

    public final void setAverageScoreRatio(double d11) {
        this.averageScoreRatio = d11;
    }

    public final void setBonusAverage(double d11) {
        this.bonusAverage = d11;
    }

    public final void setBonusBad(double d11) {
        this.bonusBad = d11;
    }

    public final void setBonusGood(double d11) {
        this.bonusGood = d11;
    }

    public final void setBonusPerfect(double d11) {
        this.bonusPerfect = d11;
    }

    public final void setBonusUnknown(double d11) {
        this.bonusUnknown = d11;
    }

    public final void setDurationAverageThreshold(double d11) {
        this.durationAverageThreshold = d11;
    }

    public final void setDurationBadScore(int i11) {
        this.durationBadScore = i11;
    }

    public final void setDurationBadSlope(int i11) {
        this.durationBadSlope = i11;
    }

    public final void setDurationBadThreshold(double d11) {
        this.durationBadThreshold = d11;
    }

    public final void setDurationGoodScore(int i11) {
        this.durationGoodScore = i11;
    }

    public final void setDurationGoodThreshold(double d11) {
        this.durationGoodThreshold = d11;
    }

    public final void setDurationMaxThreshold(double d11) {
        this.durationMaxThreshold = d11;
    }

    public final void setDurationPerfectScore(int i11) {
        this.durationPerfectScore = i11;
    }

    public final void setDurationPerfectThreshold(double d11) {
        this.durationPerfectThreshold = d11;
    }

    public final void setGoodScoreRatio(double d11) {
        this.goodScoreRatio = d11;
    }

    public final void setInterruptionsAverageThreshold(double d11) {
        this.interruptionsAverageThreshold = d11;
    }

    public final void setInterruptionsGoodThreshold(double d11) {
        this.interruptionsGoodThreshold = d11;
    }

    public final void setInterruptionsMaxScore(int i11) {
        this.interruptionsMaxScore = i11;
    }

    public final void setInterruptionsPerfectThreshold(double d11) {
        this.interruptionsPerfectThreshold = d11;
    }

    public final void setMinBedTimes(int i11) {
        this.minBedTimes = i11;
    }

    public final void setPerfectScoreRatio(double d11) {
        this.perfectScoreRatio = d11;
    }

    public final void setRecoveryAverageThreshold(double d11) {
        this.recoveryAverageThreshold = d11;
    }

    public final void setRecoveryGoodThreshold(double d11) {
        this.recoveryGoodThreshold = d11;
    }

    public final void setRecoveryMaxScore(int i11) {
        this.recoveryMaxScore = i11;
    }

    public final void setRecoveryPerfectThreshold(double d11) {
        this.recoveryPerfectThreshold = d11;
    }

    public final void setRegularityAverageThreshold(double d11) {
        this.regularityAverageThreshold = d11;
    }

    public final void setRegularityGoodThreshold(double d11) {
        this.regularityGoodThreshold = d11;
    }

    public final void setRegularityMaxScore(int i11) {
        this.regularityMaxScore = i11;
    }

    public final void setRegularityPerfectThreshold(double d11) {
        this.regularityPerfectThreshold = d11;
    }

    public final void setTimeToSleepGoodScore(int i11) {
        this.timeToSleepGoodScore = i11;
    }

    public final void setTimeToSleepGoodThreshold(int i11) {
        this.timeToSleepGoodThreshold = i11;
    }

    public final void setTimeToSleepLongThreshold(int i11) {
        this.timeToSleepLongThreshold = i11;
    }

    public final void setWakeupGoodScore(int i11) {
        this.wakeupGoodScore = i11;
    }

    public final void setWakeupGoodThreshold(int i11) {
        this.wakeupGoodThreshold = i11;
    }

    public final void setWakeupLongThreshold(int i11) {
        this.wakeupLongThreshold = i11;
    }

    public final void setWithoutRegularity(double d11) {
        this.withoutRegularity = d11;
    }
}
