package com.withings.programs.model.program;

import androidx.camera.camera2.internal.k0;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: FeatureDomain.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/withings/programs/model/program/FeatureDomain;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "summary", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getSummary", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FeatureDomain {
    private final String label;
    private final String summary;

    public FeatureDomain(String label, String summary) {
        u.j(label, "label");
        u.j(summary, "summary");
        this.label = label;
        this.summary = summary;
    }

    public static /* synthetic */ FeatureDomain copy$default(FeatureDomain featureDomain, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = featureDomain.label;
        }
        if ((i11 & 2) != 0) {
            str2 = featureDomain.summary;
        }
        return featureDomain.copy(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.summary;
    }

    public final FeatureDomain copy(String label, String summary) {
        u.j(label, "label");
        u.j(summary, "summary");
        return new FeatureDomain(label, summary);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureDomain)) {
            return false;
        }
        FeatureDomain featureDomain = (FeatureDomain) obj;
        if (u.e(this.label, featureDomain.label) && u.e(this.summary, featureDomain.summary)) {
            return true;
        }
        return false;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return this.summary.hashCode() + (this.label.hashCode() * 31);
    }

    public String toString() {
        return k0.c("FeatureDomain(label=", this.label, ", summary=", this.summary, ")");
    }
}
