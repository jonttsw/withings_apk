package com.withings.programs.model.room.enrolled;

import com.withings.programs.model.room.programcontent.EnrolledProgramEntity;
import com.withings.programs.model.room.programcontent.IterationProgramEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: EnrolledEntity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/withings/programs/model/room/enrolled/EnrolledEntity;", "", "enrolledDetail", "Lcom/withings/programs/model/room/programcontent/EnrolledProgramEntity;", "iterations", "", "Lcom/withings/programs/model/room/programcontent/IterationProgramEntity;", "(Lcom/withings/programs/model/room/programcontent/EnrolledProgramEntity;Ljava/util/List;)V", "getEnrolledDetail", "()Lcom/withings/programs/model/room/programcontent/EnrolledProgramEntity;", "getIterations", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EnrolledEntity {
    private final EnrolledProgramEntity enrolledDetail;
    private final List<IterationProgramEntity> iterations;

    public EnrolledEntity(EnrolledProgramEntity enrolledProgramEntity, List<IterationProgramEntity> list) {
        this.enrolledDetail = enrolledProgramEntity;
        this.iterations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnrolledEntity copy$default(EnrolledEntity enrolledEntity, EnrolledProgramEntity enrolledProgramEntity, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            enrolledProgramEntity = enrolledEntity.enrolledDetail;
        }
        if ((i11 & 2) != 0) {
            list = enrolledEntity.iterations;
        }
        return enrolledEntity.copy(enrolledProgramEntity, list);
    }

    public final EnrolledProgramEntity component1() {
        return this.enrolledDetail;
    }

    public final List<IterationProgramEntity> component2() {
        return this.iterations;
    }

    public final EnrolledEntity copy(EnrolledProgramEntity enrolledProgramEntity, List<IterationProgramEntity> list) {
        return new EnrolledEntity(enrolledProgramEntity, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnrolledEntity)) {
            return false;
        }
        EnrolledEntity enrolledEntity = (EnrolledEntity) obj;
        if (u.e(this.enrolledDetail, enrolledEntity.enrolledDetail) && u.e(this.iterations, enrolledEntity.iterations)) {
            return true;
        }
        return false;
    }

    public final EnrolledProgramEntity getEnrolledDetail() {
        return this.enrolledDetail;
    }

    public final List<IterationProgramEntity> getIterations() {
        return this.iterations;
    }

    public int hashCode() {
        int hashCode;
        EnrolledProgramEntity enrolledProgramEntity = this.enrolledDetail;
        int i11 = 0;
        if (enrolledProgramEntity == null) {
            hashCode = 0;
        } else {
            hashCode = enrolledProgramEntity.hashCode();
        }
        int i12 = hashCode * 31;
        List<IterationProgramEntity> list = this.iterations;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        EnrolledProgramEntity enrolledProgramEntity = this.enrolledDetail;
        List<IterationProgramEntity> list = this.iterations;
        return "EnrolledEntity(enrolledDetail=" + enrolledProgramEntity + ", iterations=" + list + ")";
    }
}
