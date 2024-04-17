package com.withings.manualLogging.ui.feature.addNote;

import java.util.ArrayList;
import java.util.List;
/* compiled from: AddNotesViewModel.kt */
/* loaded from: classes4.dex */
final class m1 extends kotlin.jvm.internal.w implements ym0.l<List<fx.f>, List<fx.f>> {

    /* renamed from: a  reason: collision with root package name */
    public static final m1 f41516a = new kotlin.jvm.internal.w(1);

    @Override // ym0.l
    public final List<fx.f> invoke(List<fx.f> list) {
        List<fx.f> list2 = list;
        kotlin.jvm.internal.u.j(list2, "list");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (kotlin.jvm.internal.u.e(((fx.f) obj).d(), "3")) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
