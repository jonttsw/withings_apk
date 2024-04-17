package com.withings.wiscale2.legacyprograms;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.programs.model.program.ProgramDomain;
import kotlin.Metadata;
/* compiled from: WellnessProgramsAdapter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/ProgramClickListener;", "", "Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "wellnessProgram", "Lnm0/y;", "onProgramClicked", "(Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;)V", "", "isFinished", "", NavigationArguments.PROGRAM_ID, "", "url", "onOnGoingProgramClicked", "(ZILjava/lang/String;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public interface ProgramClickListener {
    void onOnGoingProgramClicked(boolean z5, int i11, String str);

    void onProgramClicked(ProgramDomain.LegacyDomain legacyDomain);
}
