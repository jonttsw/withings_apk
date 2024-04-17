package com.withings.feature.platform.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: PlatformFeatureWS.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ*\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/withings/feature/platform/model/PlatformFeatureListWS;", "", "features", "", "Lcom/withings/feature/platform/model/PlatformFeatureWS;", "modified", "", "(Ljava/util/List;Ljava/lang/Long;)V", "getFeatures", "()Ljava/util/List;", "getModified", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Long;)Lcom/withings/feature/platform/model/PlatformFeatureListWS;", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlatformFeatureListWS {
    private final List<PlatformFeatureWS> features;
    private final Long modified;

    public PlatformFeatureListWS(List<PlatformFeatureWS> features, Long l5) {
        u.j(features, "features");
        this.features = features;
        this.modified = l5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformFeatureListWS copy$default(PlatformFeatureListWS platformFeatureListWS, List list, Long l5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = platformFeatureListWS.features;
        }
        if ((i11 & 2) != 0) {
            l5 = platformFeatureListWS.modified;
        }
        return platformFeatureListWS.copy(list, l5);
    }

    public final List<PlatformFeatureWS> component1() {
        return this.features;
    }

    public final Long component2() {
        return this.modified;
    }

    public final PlatformFeatureListWS copy(List<PlatformFeatureWS> features, Long l5) {
        u.j(features, "features");
        return new PlatformFeatureListWS(features, l5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformFeatureListWS)) {
            return false;
        }
        PlatformFeatureListWS platformFeatureListWS = (PlatformFeatureListWS) obj;
        if (u.e(this.features, platformFeatureListWS.features) && u.e(this.modified, platformFeatureListWS.modified)) {
            return true;
        }
        return false;
    }

    public final List<PlatformFeatureWS> getFeatures() {
        return this.features;
    }

    public final Long getModified() {
        return this.modified;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.features.hashCode() * 31;
        Long l5 = this.modified;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        List<PlatformFeatureWS> list = this.features;
        Long l5 = this.modified;
        return "PlatformFeatureListWS(features=" + list + ", modified=" + l5 + ")";
    }
}
