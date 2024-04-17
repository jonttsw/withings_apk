package com.withings.badge.list;

import ah.o;
import com.withings.badge.model.BadgeModelUI;
import java.util.List;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BadgesScreen.kt */
/* loaded from: classes3.dex */
public final class f extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<BadgeModelUI> f32808a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<Long, String, y> f32809b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f32810c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i11, List list, p pVar) {
        super(2);
        this.f32808a = list;
        this.f32809b = pVar;
        this.f32810c = i11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        g.a(o.g(this.f32810c | 1), aVar, this.f32808a, this.f32809b);
        return y.f85009a;
    }
}
