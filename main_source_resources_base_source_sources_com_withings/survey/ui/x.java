package com.withings.survey.ui;

import java.util.Iterator;
import java.util.List;
import t50.a;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class x extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<List<z50.a>, nm0.y> f44457a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t50.a f44458b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(ym0.l<? super List<z50.a>, nm0.y> lVar, t50.a aVar) {
        super(1);
        this.f44457a = lVar;
        this.f44458b = aVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        Object obj;
        String b10;
        int intValue = num.intValue();
        Integer valueOf = Integer.valueOf(intValue);
        Iterator<T> it = ((a.g) this.f44458b).g().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (intValue == ((r50.a) obj).a()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        r50.a aVar = (r50.a) obj;
        if (aVar != null && (b10 = aVar.b()) != null) {
            this.f44457a.invoke(kotlin.collections.x.V(new z50.a(valueOf, b10)));
            return nm0.y.f85009a;
        }
        throw new Exception("Text can't be null");
    }
}
