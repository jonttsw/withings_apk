package com.withings.tutorials.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1.o1;
/* compiled from: DeviceIntroductionActivity.kt */
/* loaded from: classes4.dex */
final class l extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceIntroductionActivity f44770a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o1<List<o60.f>> f44771b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(DeviceIntroductionActivity deviceIntroductionActivity, o1<? extends List<o60.f>> o1Var) {
        super(0);
        this.f44770a = deviceIntroductionActivity;
        this.f44771b = o1Var;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        boolean z5;
        o1<List<o60.f>> o1Var = this.f44771b;
        if (!o1Var.getValue().isEmpty() && DeviceIntroductionActivity.A3(this.f44770a)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : o1Var.getValue()) {
                o60.f fVar = (o60.f) obj;
                if (fVar.d() && fVar.b()) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((o60.f) it.next()).c()) {
                        z5 = false;
                        break;
                    }
                }
            }
        }
        z5 = true;
        return Boolean.valueOf(z5);
    }
}
