package com.withings.survey.ui;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
public final class l1 extends kotlin.jvm.internal.w implements ym0.a<t50.a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y50.a f44378a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.o1<Integer> f44379b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(y50.a aVar, k1.r0 r0Var) {
        super(0);
        this.f44378a = aVar;
        this.f44379b = r0Var;
    }

    @Override // ym0.a
    public final t50.a invoke() {
        Object obj;
        Iterator<T> it = this.f44378a.a().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                int d11 = ((t50.a) obj).d();
                int i11 = InAppSurveyActivity.f44288f;
                Integer value = this.f44379b.getValue();
                if (value != null && d11 == value.intValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (t50.a) obj;
    }
}
