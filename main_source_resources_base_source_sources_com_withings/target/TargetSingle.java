package com.withings.target;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: Target.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/withings/target/TargetSingle;", "", "single", "Lcom/withings/target/Target;", "(Lcom/withings/target/Target;)V", "getSingle", "()Lcom/withings/target/Target;", "setSingle", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "target_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TargetSingle {
    @SerializedName("target")
    private Target single;

    public TargetSingle() {
        this(null, 1, null);
    }

    public static /* synthetic */ TargetSingle copy$default(TargetSingle targetSingle, Target target, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            target = targetSingle.single;
        }
        return targetSingle.copy(target);
    }

    public final Target component1() {
        return this.single;
    }

    public final TargetSingle copy(Target target) {
        return new TargetSingle(target);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TargetSingle) && u.e(this.single, ((TargetSingle) obj).single)) {
            return true;
        }
        return false;
    }

    public final Target getSingle() {
        return this.single;
    }

    public int hashCode() {
        Target target = this.single;
        if (target == null) {
            return 0;
        }
        return target.hashCode();
    }

    public final void setSingle(Target target) {
        this.single = target;
    }

    public String toString() {
        Target target = this.single;
        return "TargetSingle(single=" + target + ")";
    }

    public TargetSingle(Target target) {
        this.single = target;
    }

    public /* synthetic */ TargetSingle(Target target, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : target);
    }
}
