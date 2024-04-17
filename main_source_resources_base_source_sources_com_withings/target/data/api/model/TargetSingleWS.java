package com.withings.target.data.api.model;

import com.google.gson.annotations.SerializedName;
import com.withings.target.Target;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: TargetWS.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/target/data/api/model/TargetSingleWS;", "", "single", "Lcom/withings/target/Target;", "(Lcom/withings/target/Target;)V", "getSingle", "()Lcom/withings/target/Target;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "target_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TargetSingleWS {
    @SerializedName("target")
    private final Target single;

    public TargetSingleWS() {
        this(null, 1, null);
    }

    public static /* synthetic */ TargetSingleWS copy$default(TargetSingleWS targetSingleWS, Target target, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            target = targetSingleWS.single;
        }
        return targetSingleWS.copy(target);
    }

    public final Target component1() {
        return this.single;
    }

    public final TargetSingleWS copy(Target target) {
        return new TargetSingleWS(target);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TargetSingleWS) && u.e(this.single, ((TargetSingleWS) obj).single)) {
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

    public String toString() {
        Target target = this.single;
        return "TargetSingleWS(single=" + target + ")";
    }

    public TargetSingleWS(Target target) {
        this.single = target;
    }

    public /* synthetic */ TargetSingleWS(Target target, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : target);
    }
}
