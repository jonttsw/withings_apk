package com.withings.programs.viewmodel;

import com.withings.programs.model.program.ProgramDomain;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: AchieveViewModel.kt */
/* loaded from: classes4.dex */
final class h extends w implements ym0.l<ProgramDomain, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final h f43832a = new w(1);

    @Override // ym0.l
    public final Boolean invoke(ProgramDomain programDomain) {
        ProgramDomain program = programDomain;
        u.j(program, "program");
        return Boolean.valueOf(program.isSuggested());
    }
}
