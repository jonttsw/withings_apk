package com.withings.manualLogging.data.webservice.healthAttribute;

import androidx.camera.camera2.internal.e;
import androidx.camera.core.y1;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: GetHealthAttributeResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B)\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\bHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/withings/manualLogging/data/webservice/healthAttribute/GetHealthAttributeResponse;", "", "healthAttributes", "", "Lcom/withings/manualLogging/data/webservice/healthAttribute/WebServiceHealthAttribute;", "hasMore", "", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "", "(Ljava/util/List;ZI)V", "getHasMore", "()Z", "getHealthAttributes", "()Ljava/util/List;", "getOffset", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetHealthAttributeResponse {
    public static final Companion Companion = new Companion(null);
    public static final String FIELD_HAS_MORE_NAME = "more";
    public static final String FIELD_HEALTH_ATTRIBUTES_NAME = "data";
    public static final String FIELD_OFFSET_NAME = "offset";
    @SerializedName(FIELD_HAS_MORE_NAME)
    private final boolean hasMore;
    @SerializedName("data")
    private final List<WebServiceHealthAttribute> healthAttributes;
    @SerializedName(FIELD_OFFSET_NAME)
    private final int offset;

    /* compiled from: GetHealthAttributeResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/withings/manualLogging/data/webservice/healthAttribute/GetHealthAttributeResponse$Companion;", "", "()V", "FIELD_HAS_MORE_NAME", "", "FIELD_HEALTH_ATTRIBUTES_NAME", "FIELD_OFFSET_NAME", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public GetHealthAttributeResponse() {
        this(null, false, 0, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetHealthAttributeResponse copy$default(GetHealthAttributeResponse getHealthAttributeResponse, List list, boolean z5, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = getHealthAttributeResponse.healthAttributes;
        }
        if ((i12 & 2) != 0) {
            z5 = getHealthAttributeResponse.hasMore;
        }
        if ((i12 & 4) != 0) {
            i11 = getHealthAttributeResponse.offset;
        }
        return getHealthAttributeResponse.copy(list, z5, i11);
    }

    public final List<WebServiceHealthAttribute> component1() {
        return this.healthAttributes;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final int component3() {
        return this.offset;
    }

    public final GetHealthAttributeResponse copy(List<WebServiceHealthAttribute> healthAttributes, boolean z5, int i11) {
        u.j(healthAttributes, "healthAttributes");
        return new GetHealthAttributeResponse(healthAttributes, z5, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetHealthAttributeResponse)) {
            return false;
        }
        GetHealthAttributeResponse getHealthAttributeResponse = (GetHealthAttributeResponse) obj;
        if (u.e(this.healthAttributes, getHealthAttributeResponse.healthAttributes) && this.hasMore == getHealthAttributeResponse.hasMore && this.offset == getHealthAttributeResponse.offset) {
            return true;
        }
        return false;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<WebServiceHealthAttribute> getHealthAttributes() {
        return this.healthAttributes;
    }

    public final int getOffset() {
        return this.offset;
    }

    public int hashCode() {
        return Integer.hashCode(this.offset) + y1.a(this.hasMore, this.healthAttributes.hashCode() * 31, 31);
    }

    public String toString() {
        List<WebServiceHealthAttribute> list = this.healthAttributes;
        boolean z5 = this.hasMore;
        int i11 = this.offset;
        StringBuilder sb2 = new StringBuilder("GetHealthAttributeResponse(healthAttributes=");
        sb2.append(list);
        sb2.append(", hasMore=");
        sb2.append(z5);
        sb2.append(", offset=");
        return e.c(sb2, i11, ")");
    }

    public GetHealthAttributeResponse(List<WebServiceHealthAttribute> healthAttributes, boolean z5, int i11) {
        u.j(healthAttributes, "healthAttributes");
        this.healthAttributes = healthAttributes;
        this.hasMore = z5;
        this.offset = i11;
    }

    public /* synthetic */ GetHealthAttributeResponse(List list, boolean z5, int i11, int i12, m mVar) {
        this((i12 & 1) != 0 ? i0.f76187a : list, (i12 & 2) != 0 ? false : z5, (i12 & 4) != 0 ? 0 : i11);
    }
}
