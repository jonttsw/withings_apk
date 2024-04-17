package com.withings.survey.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t50.a;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class w extends kotlin.jvm.internal.w implements ym0.l<List<? extends Integer>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<List<z50.a>, nm0.y> f44454a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t50.a f44455b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(ym0.l<? super List<z50.a>, nm0.y> lVar, t50.a aVar) {
        super(1);
        this.f44454a = lVar;
        this.f44455b = aVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<? extends Integer> list) {
        Object obj;
        String b10;
        List<? extends Integer> choicesId = list;
        kotlin.jvm.internal.u.j(choicesId, "choicesId");
        List<? extends Integer> list2 = choicesId;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
        for (Number number : list2) {
            int intValue = number.intValue();
            Integer valueOf = Integer.valueOf(intValue);
            Iterator<T> it = ((a.c) this.f44455b).g().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((r50.a) obj).a() == intValue) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r50.a aVar = (r50.a) obj;
            if (aVar != null && (b10 = aVar.b()) != null) {
                arrayList.add(new z50.a(valueOf, b10));
            } else {
                throw new Exception("Text can't be null");
            }
        }
        this.f44454a.invoke(arrayList);
        return nm0.y.f85009a;
    }
}
