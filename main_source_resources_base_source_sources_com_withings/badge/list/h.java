package com.withings.badge.list;

import com.withings.badge.model.BadgeSectionType;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.w;
import n0.z0;
/* compiled from: BadgesScreen.kt */
/* loaded from: classes3.dex */
final class h extends w implements ym0.a<BadgeSectionType> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Map<BadgeSectionType, Integer> f32829a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z0 f32830b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Map<BadgeSectionType, Integer> map, z0 z0Var) {
        super(0);
        this.f32829a = map;
        this.f32830b = z0Var;
    }

    @Override // ym0.a
    public final BadgeSectionType invoke() {
        int i11;
        int m11 = this.f32830b.m();
        Map<BadgeSectionType, Integer> map = this.f32829a;
        int i12 = 0;
        for (nm0.j jVar : s0.o(map)) {
            Integer num = (Integer) jVar.d();
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = 0;
            }
            i12 += i11;
            if (i12 > m11) {
                return (BadgeSectionType) jVar.c();
            }
        }
        return (BadgeSectionType) x.H(map.keySet());
    }
}
