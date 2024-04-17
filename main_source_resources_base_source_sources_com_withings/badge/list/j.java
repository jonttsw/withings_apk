package com.withings.badge.list;

import ah.o;
import com.withings.badge.model.BadgeSection;
import com.withings.badge.model.BadgeSectionType;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.w;
import n0.z0;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BadgesScreen.kt */
/* loaded from: classes3.dex */
public final class j extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<BadgeSection> f32836a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map<BadgeSectionType, Integer> f32837b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ z0 f32838c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<Long, String, y> f32839d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f32840e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(List<BadgeSection> list, Map<BadgeSectionType, Integer> map, z0 z0Var, p<? super Long, ? super String, y> pVar, int i11) {
        super(2);
        this.f32836a = list;
        this.f32837b = map;
        this.f32838c = z0Var;
        this.f32839d = pVar;
        this.f32840e = i11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = o.g(this.f32840e | 1);
        z0 z0Var = this.f32838c;
        p<Long, String, y> pVar = this.f32839d;
        g.g(this.f32836a, this.f32837b, z0Var, pVar, aVar, g11);
        return y.f85009a;
    }
}
