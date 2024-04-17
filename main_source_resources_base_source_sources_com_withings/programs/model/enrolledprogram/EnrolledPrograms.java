package com.withings.programs.model.enrolledprogram;

import androidx.camera.core.y1;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: EnrolledPrograms.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J@\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/withings/programs/model/enrolledprogram/EnrolledPrograms;", "", "programs", "", "Lcom/withings/programs/model/enrolledprogram/EnrolledProgram;", GetHealthAttributeResponse.FIELD_HAS_MORE_NAME, "", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "", "modified", "Lorg/joda/time/DateTime;", "(Ljava/util/List;ZLjava/lang/Integer;Lorg/joda/time/DateTime;)V", "getModified", "()Lorg/joda/time/DateTime;", "getMore", "()Z", "getOffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrograms", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;ZLjava/lang/Integer;Lorg/joda/time/DateTime;)Lcom/withings/programs/model/enrolledprogram/EnrolledPrograms;", "equals", "other", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EnrolledPrograms {
    private final DateTime modified;
    private final boolean more;
    private final Integer offset;
    private final List<EnrolledProgram> programs;

    public EnrolledPrograms(List<EnrolledProgram> programs, boolean z5, Integer num, DateTime dateTime) {
        u.j(programs, "programs");
        this.programs = programs;
        this.more = z5;
        this.offset = num;
        this.modified = dateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnrolledPrograms copy$default(EnrolledPrograms enrolledPrograms, List list, boolean z5, Integer num, DateTime dateTime, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = enrolledPrograms.programs;
        }
        if ((i11 & 2) != 0) {
            z5 = enrolledPrograms.more;
        }
        if ((i11 & 4) != 0) {
            num = enrolledPrograms.offset;
        }
        if ((i11 & 8) != 0) {
            dateTime = enrolledPrograms.modified;
        }
        return enrolledPrograms.copy(list, z5, num, dateTime);
    }

    public final List<EnrolledProgram> component1() {
        return this.programs;
    }

    public final boolean component2() {
        return this.more;
    }

    public final Integer component3() {
        return this.offset;
    }

    public final DateTime component4() {
        return this.modified;
    }

    public final EnrolledPrograms copy(List<EnrolledProgram> programs, boolean z5, Integer num, DateTime dateTime) {
        u.j(programs, "programs");
        return new EnrolledPrograms(programs, z5, num, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnrolledPrograms)) {
            return false;
        }
        EnrolledPrograms enrolledPrograms = (EnrolledPrograms) obj;
        if (u.e(this.programs, enrolledPrograms.programs) && this.more == enrolledPrograms.more && u.e(this.offset, enrolledPrograms.offset) && u.e(this.modified, enrolledPrograms.modified)) {
            return true;
        }
        return false;
    }

    public final DateTime getModified() {
        return this.modified;
    }

    public final boolean getMore() {
        return this.more;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final List<EnrolledProgram> getPrograms() {
        return this.programs;
    }

    public int hashCode() {
        int hashCode;
        int a11 = y1.a(this.more, this.programs.hashCode() * 31, 31);
        Integer num = this.offset;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        DateTime dateTime = this.modified;
        if (dateTime != null) {
            i11 = dateTime.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        List<EnrolledProgram> list = this.programs;
        boolean z5 = this.more;
        Integer num = this.offset;
        DateTime dateTime = this.modified;
        return "EnrolledPrograms(programs=" + list + ", more=" + z5 + ", offset=" + num + ", modified=" + dateTime + ")";
    }

    public /* synthetic */ EnrolledPrograms(List list, boolean z5, Integer num, DateTime dateTime, int i11, m mVar) {
        this(list, z5, num, (i11 & 8) != 0 ? null : dateTime);
    }
}
