package com.withings.target;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: WeightGoal.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/withings/target/WeightGoal;", "Ljava/io/Serializable;", "target", "", "speed", "date", "Lorg/joda/time/DateTime;", "(DDLorg/joda/time/DateTime;)V", "getDate", "()Lorg/joda/time/DateTime;", "setDate", "(Lorg/joda/time/DateTime;)V", "getSpeed", "()D", "setSpeed", "(D)V", "getTarget", "setTarget", "target_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WeightGoal implements Serializable {
    private DateTime date;
    private double speed;
    private double target;

    public WeightGoal(double d11, double d12) {
        this(d11, d12, null, 4, null);
    }

    public final DateTime getDate() {
        return this.date;
    }

    public final double getSpeed() {
        double d11 = this.speed;
        double pow = Math.pow(10.0d, 1);
        return Math.rint(d11 * pow) / pow;
    }

    public final double getTarget() {
        return this.target;
    }

    public final void setDate(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.date = dateTime;
    }

    public final void setSpeed(double d11) {
        this.speed = d11;
    }

    public final void setTarget(double d11) {
        this.target = d11;
    }

    public WeightGoal(double d11, double d12, DateTime date) {
        u.j(date, "date");
        this.target = d11;
        this.date = date;
        this.speed = d12;
    }

    public /* synthetic */ WeightGoal(double d11, double d12, DateTime dateTime, int i11, m mVar) {
        this(d11, d12, (i11 & 4) != 0 ? new DateTime() : dateTime);
    }
}
