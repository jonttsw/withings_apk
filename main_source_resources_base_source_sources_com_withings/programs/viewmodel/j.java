package com.withings.programs.viewmodel;

import com.withings.contentproviders.model.content.ContentAccessLevel;
import com.withings.programs.model.program.ProgramDomain;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: AchieveViewModel.kt */
/* loaded from: classes4.dex */
final class j extends w implements ym0.l<ProgramDomain, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final j f43834a = new w(1);

    @Override // ym0.l
    public final Boolean invoke(ProgramDomain programDomain) {
        boolean z5;
        ProgramDomain program = programDomain;
        u.j(program, "program");
        if (program.getAccessLevel() == ContentAccessLevel.f35292d) {
            z5 = true;
        } else {
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }
}
