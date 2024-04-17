package com.withings.programs.model.room.programcontent;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ContentProgramEntity.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/withings/programs/model/room/programcontent/ContentProgramEntity;", "", "programDetail", "Lcom/withings/programs/model/room/programcontent/ProgramDetailEntity;", "enrolledDetail", "Lcom/withings/programs/model/room/programcontent/EnrolledProgramEntity;", "iterations", "", "Lcom/withings/programs/model/room/programcontent/IterationProgramEntity;", "(Lcom/withings/programs/model/room/programcontent/ProgramDetailEntity;Lcom/withings/programs/model/room/programcontent/EnrolledProgramEntity;Ljava/util/List;)V", "getEnrolledDetail", "()Lcom/withings/programs/model/room/programcontent/EnrolledProgramEntity;", "getIterations", "()Ljava/util/List;", "getProgramDetail", "()Lcom/withings/programs/model/room/programcontent/ProgramDetailEntity;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContentProgramEntity {
    private final EnrolledProgramEntity enrolledDetail;
    private final List<IterationProgramEntity> iterations;
    private final ProgramDetailEntity programDetail;

    public ContentProgramEntity(ProgramDetailEntity programDetail, EnrolledProgramEntity enrolledProgramEntity, List<IterationProgramEntity> list) {
        u.j(programDetail, "programDetail");
        this.programDetail = programDetail;
        this.enrolledDetail = enrolledProgramEntity;
        this.iterations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentProgramEntity copy$default(ContentProgramEntity contentProgramEntity, ProgramDetailEntity programDetailEntity, EnrolledProgramEntity enrolledProgramEntity, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            programDetailEntity = contentProgramEntity.programDetail;
        }
        if ((i11 & 2) != 0) {
            enrolledProgramEntity = contentProgramEntity.enrolledDetail;
        }
        if ((i11 & 4) != 0) {
            list = contentProgramEntity.iterations;
        }
        return contentProgramEntity.copy(programDetailEntity, enrolledProgramEntity, list);
    }

    public final ProgramDetailEntity component1() {
        return this.programDetail;
    }

    public final EnrolledProgramEntity component2() {
        return this.enrolledDetail;
    }

    public final List<IterationProgramEntity> component3() {
        return this.iterations;
    }

    public final ContentProgramEntity copy(ProgramDetailEntity programDetail, EnrolledProgramEntity enrolledProgramEntity, List<IterationProgramEntity> list) {
        u.j(programDetail, "programDetail");
        return new ContentProgramEntity(programDetail, enrolledProgramEntity, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentProgramEntity)) {
            return false;
        }
        ContentProgramEntity contentProgramEntity = (ContentProgramEntity) obj;
        if (u.e(this.programDetail, contentProgramEntity.programDetail) && u.e(this.enrolledDetail, contentProgramEntity.enrolledDetail) && u.e(this.iterations, contentProgramEntity.iterations)) {
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

    public final ProgramDetailEntity getProgramDetail() {
        return this.programDetail;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.programDetail.hashCode() * 31;
        EnrolledProgramEntity enrolledProgramEntity = this.enrolledDetail;
        int i11 = 0;
        if (enrolledProgramEntity == null) {
            hashCode = 0;
        } else {
            hashCode = enrolledProgramEntity.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        List<IterationProgramEntity> list = this.iterations;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        ProgramDetailEntity programDetailEntity = this.programDetail;
        EnrolledProgramEntity enrolledProgramEntity = this.enrolledDetail;
        List<IterationProgramEntity> list = this.iterations;
        StringBuilder sb2 = new StringBuilder("ContentProgramEntity(programDetail=");
        sb2.append(programDetailEntity);
        sb2.append(", enrolledDetail=");
        sb2.append(enrolledProgramEntity);
        sb2.append(", iterations=");
        return d.i(sb2, list, ")");
    }
}
