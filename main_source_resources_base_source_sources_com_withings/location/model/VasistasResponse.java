package com.withings.location.model;

import bn.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: VasistasSeries.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/withings/location/model/VasistasResponse;", "", "series", "", "Lcom/withings/location/model/VasistasSeries;", "(Ljava/util/List;)V", "getSeries", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VasistasResponse {
    private final List<VasistasSeries> series;

    public VasistasResponse() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VasistasResponse copy$default(VasistasResponse vasistasResponse, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = vasistasResponse.series;
        }
        return vasistasResponse.copy(list);
    }

    public final List<VasistasSeries> component1() {
        return this.series;
    }

    public final VasistasResponse copy(List<VasistasSeries> list) {
        return new VasistasResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof VasistasResponse) && u.e(this.series, ((VasistasResponse) obj).series)) {
            return true;
        }
        return false;
    }

    public final List<VasistasSeries> getSeries() {
        return this.series;
    }

    public int hashCode() {
        List<VasistasSeries> list = this.series;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return d.b("VasistasResponse(series=", this.series, ")");
    }

    public VasistasResponse(List<VasistasSeries> list) {
        this.series = list;
    }

    public /* synthetic */ VasistasResponse(List list, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : list);
    }
}
