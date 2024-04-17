package com.withings.badge.list;

import android.app.Application;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.badge.list.k;
import com.withings.badge.model.BadgeModelUIKt;
import com.withings.badge.model.BadgeSection;
import com.withings.badge.model.BadgeSectionType;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import nm0.y;
import ym0.q;
/* compiled from: BadgesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/badge/list/BadgesViewModel;", "Landroidx/lifecycle/b;", "badge_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BadgesViewModel extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final bi.a f32795a;

    /* renamed from: b  reason: collision with root package name */
    private final StateFlow<k> f32796b;

    /* compiled from: BadgesViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.badge.list.BadgesViewModel$badgesScreenState$1", f = "BadgesViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements q<Map<Integer, ? extends List<? extends ai.a>>, Map<Integer, ? extends List<? extends ai.a>>, qm0.d<? super k.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Map f32797a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Map f32798b;

        a(qm0.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(Map<Integer, ? extends List<? extends ai.a>> map, Map<Integer, ? extends List<? extends ai.a>> map2, qm0.d<? super k.a> dVar) {
            a aVar = new a(dVar);
            aVar.f32797a = map;
            aVar.f32798b = map2;
            return aVar.invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.collections.i0] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            int i11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Map map = this.f32797a;
            Map map2 = this.f32798b;
            List<BadgeSectionType> W = x.W(BadgeSectionType.WEIGHT, BadgeSectionType.STEPS, BadgeSectionType.DISTANCE, BadgeSectionType.ELEVATION);
            ArrayList arrayList2 = new ArrayList(x.y(W, 10));
            for (BadgeSectionType badgeSectionType : W) {
                List list = (List) map.get(new Integer(badgeSectionType.getWsConstant()));
                ?? r62 = i0.f76187a;
                BadgesViewModel badgesViewModel = BadgesViewModel.this;
                if (list != null) {
                    List<ai.a> list2 = list;
                    arrayList = new ArrayList(x.y(list2, 10));
                    for (ai.a aVar : list2) {
                        arrayList.add(BadgeModelUIKt.toUnlockedUIModel(aVar, badgesViewModel.f32795a, badgesViewModel.getApplication()));
                    }
                } else {
                    arrayList = r62;
                }
                ArrayList arrayList3 = arrayList;
                List list3 = (List) map2.get(new Integer(badgeSectionType.getWsConstant()));
                if (list3 != null) {
                    List<ai.a> list4 = list3;
                    r62 = new ArrayList(x.y(list4, 10));
                    for (ai.a aVar2 : list4) {
                        r62.add(BadgeModelUIKt.toLockedUIModel(aVar2, badgesViewModel.f32795a, badgesViewModel.getApplication()));
                    }
                }
                ArrayList l02 = x.l0(r62, arrayList3);
                List list5 = (List) map.get(new Integer(badgeSectionType.getWsConstant()));
                if (list5 != null) {
                    i11 = list5.size();
                } else {
                    i11 = 0;
                }
                arrayList2.add(new BadgeSection(badgeSectionType, i11, l02.size(), l02));
            }
            return new k.a(arrayList2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public BadgesViewModel(Application application, di.b bVar, di.a aVar, bi.a aVar2, u0 savedStateHandle) {
        super(application);
        u.j(savedStateHandle, "savedStateHandle");
        this.f32795a = aVar2;
        Long l5 = (Long) savedStateHandle.c(NavigationArguments.USER_ID);
        if (l5 != null) {
            long longValue = l5.longValue();
            this.f32796b = FlowKt.stateIn(FlowKt.combine(bVar.a(longValue), aVar.a(longValue), new a(null)), h1.a(this), SharingStarted.Companion.getEagerly(), k.b.f32842a);
            return;
        }
        throw new RuntimeException("userId shouldn't be null");
    }

    public final StateFlow<k> g0() {
        return this.f32796b;
    }
}
