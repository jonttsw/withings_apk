package com.withings.manualLogging.ui.feature.addNote;

import java.util.Iterator;
import java.util.List;
/* compiled from: AddMedicinesScreen.kt */
/* loaded from: classes4.dex */
final class x0 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<fx.c, nm0.y> f41624a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<fx.c> f41625b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(ym0.l<? super fx.c, nm0.y> lVar, List<fx.c> list) {
        super(1);
        this.f41624a = lVar;
        this.f41625b = list;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        Object obj;
        long j5;
        String name = str;
        kotlin.jvm.internal.u.j(name, "name");
        Iterator<T> it = this.f41625b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.u.e(((fx.c) obj).b(), name)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        fx.c cVar = (fx.c) obj;
        if (cVar != null) {
            j5 = cVar.getId();
        } else {
            j5 = 0;
        }
        this.f41624a.invoke(new fx.c(name, j5, null, 4));
        return nm0.y.f85009a;
    }
}
