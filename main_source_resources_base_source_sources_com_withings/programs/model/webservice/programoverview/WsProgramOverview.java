package com.withings.programs.model.webservice.programoverview;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsProgramOverview.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/withings/programs/model/webservice/programoverview/WsProgramOverview;", "", "program", "Lcom/withings/programs/model/webservice/programoverview/Program;", "(Lcom/withings/programs/model/webservice/programoverview/Program;)V", "getProgram", "()Lcom/withings/programs/model/webservice/programoverview/Program;", "setProgram", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsProgramOverview {
    @SerializedName("program")
    private Program program;

    public WsProgramOverview(Program program) {
        u.j(program, "program");
        this.program = program;
    }

    public static /* synthetic */ WsProgramOverview copy$default(WsProgramOverview wsProgramOverview, Program program, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            program = wsProgramOverview.program;
        }
        return wsProgramOverview.copy(program);
    }

    public final Program component1() {
        return this.program;
    }

    public final WsProgramOverview copy(Program program) {
        u.j(program, "program");
        return new WsProgramOverview(program);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof WsProgramOverview) && u.e(this.program, ((WsProgramOverview) obj).program)) {
            return true;
        }
        return false;
    }

    public final Program getProgram() {
        return this.program;
    }

    public int hashCode() {
        return this.program.hashCode();
    }

    public final void setProgram(Program program) {
        u.j(program, "<set-?>");
        this.program = program;
    }

    public String toString() {
        Program program = this.program;
        return "WsProgramOverview(program=" + program + ")";
    }
}
