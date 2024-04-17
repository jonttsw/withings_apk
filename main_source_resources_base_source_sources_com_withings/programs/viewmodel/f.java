package com.withings.programs.viewmodel;

import com.withings.programs.model.program.ProgramDomain;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: AchieveViewModel.kt */
/* loaded from: classes4.dex */
final class f extends w implements ym0.l<ProgramDomain, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f43830a = new w(1);

    @Override // ym0.l
    public final Boolean invoke(ProgramDomain programDomain) {
        boolean z5;
        ProgramDomain it = programDomain;
        u.j(it, "it");
        if (it.getTargetType() != 2) {
            z5 = true;
        } else {
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }
}
