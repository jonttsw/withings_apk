package com.withings.manualLogging.data.webservice.healthAttribute;

import android.support.v4.media.session.c;
import androidx.camera.core.v;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: CreateMedicineResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/withings/manualLogging/data/webservice/healthAttribute/CreateMedicineResponse;", "", "createdMedicineInfo", "Lcom/withings/manualLogging/data/webservice/healthAttribute/CreateMedicineResponse$MedicineInfo;", "(Lcom/withings/manualLogging/data/webservice/healthAttribute/CreateMedicineResponse$MedicineInfo;)V", "getCreatedMedicineInfo", "()Lcom/withings/manualLogging/data/webservice/healthAttribute/CreateMedicineResponse$MedicineInfo;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MedicineInfo", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CreateMedicineResponse {
    @SerializedName("medicine")
    private final MedicineInfo createdMedicineInfo;

    /* compiled from: CreateMedicineResponse.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/withings/manualLogging/data/webservice/healthAttribute/CreateMedicineResponse$MedicineInfo;", "", "remoteId", "", "lastModificationDateInSeconds", "(JJ)V", "getLastModificationDateInSeconds", "()J", "getRemoteId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MedicineInfo {
        @SerializedName("modified")
        private final long lastModificationDateInSeconds;
        @SerializedName("id")
        private final long remoteId;

        public MedicineInfo(long j5, long j11) {
            this.remoteId = j5;
            this.lastModificationDateInSeconds = j11;
        }

        public static /* synthetic */ MedicineInfo copy$default(MedicineInfo medicineInfo, long j5, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j5 = medicineInfo.remoteId;
            }
            if ((i11 & 2) != 0) {
                j11 = medicineInfo.lastModificationDateInSeconds;
            }
            return medicineInfo.copy(j5, j11);
        }

        public final long component1() {
            return this.remoteId;
        }

        public final long component2() {
            return this.lastModificationDateInSeconds;
        }

        public final MedicineInfo copy(long j5, long j11) {
            return new MedicineInfo(j5, j11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MedicineInfo)) {
                return false;
            }
            MedicineInfo medicineInfo = (MedicineInfo) obj;
            if (this.remoteId == medicineInfo.remoteId && this.lastModificationDateInSeconds == medicineInfo.lastModificationDateInSeconds) {
                return true;
            }
            return false;
        }

        public final long getLastModificationDateInSeconds() {
            return this.lastModificationDateInSeconds;
        }

        public final long getRemoteId() {
            return this.remoteId;
        }

        public int hashCode() {
            return Long.hashCode(this.lastModificationDateInSeconds) + (Long.hashCode(this.remoteId) * 31);
        }

        public String toString() {
            long j5 = this.remoteId;
            return c.c(v.e("MedicineInfo(remoteId=", j5, ", lastModificationDateInSeconds="), this.lastModificationDateInSeconds, ")");
        }
    }

    public CreateMedicineResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ CreateMedicineResponse copy$default(CreateMedicineResponse createMedicineResponse, MedicineInfo medicineInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            medicineInfo = createMedicineResponse.createdMedicineInfo;
        }
        return createMedicineResponse.copy(medicineInfo);
    }

    public final MedicineInfo component1() {
        return this.createdMedicineInfo;
    }

    public final CreateMedicineResponse copy(MedicineInfo medicineInfo) {
        return new CreateMedicineResponse(medicineInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CreateMedicineResponse) && u.e(this.createdMedicineInfo, ((CreateMedicineResponse) obj).createdMedicineInfo)) {
            return true;
        }
        return false;
    }

    public final MedicineInfo getCreatedMedicineInfo() {
        return this.createdMedicineInfo;
    }

    public int hashCode() {
        MedicineInfo medicineInfo = this.createdMedicineInfo;
        if (medicineInfo == null) {
            return 0;
        }
        return medicineInfo.hashCode();
    }

    public String toString() {
        MedicineInfo medicineInfo = this.createdMedicineInfo;
        return "CreateMedicineResponse(createdMedicineInfo=" + medicineInfo + ")";
    }

    public CreateMedicineResponse(MedicineInfo medicineInfo) {
        this.createdMedicineInfo = medicineInfo;
    }

    public /* synthetic */ CreateMedicineResponse(MedicineInfo medicineInfo, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : medicineInfo);
    }
}
