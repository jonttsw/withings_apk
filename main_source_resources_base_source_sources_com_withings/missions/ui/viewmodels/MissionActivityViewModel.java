package com.withings.missions.ui.viewmodels;

import android.content.Context;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import b00.c;
import ch.d;
import com.withings.favorite.model.Favorite;
import g00.b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import nm0.l;
import nm0.y;
import or.g;
import ym0.p;
import ym0.q;
/* compiled from: MissionActivityViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/missions/ui/viewmodels/MissionActivityViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MissionActivityViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final d f42320a;

    /* renamed from: b  reason: collision with root package name */
    private final d00.d f42321b;

    /* renamed from: c  reason: collision with root package name */
    private final ni.a f42322c;

    /* compiled from: MissionActivityViewModel.kt */
    @e(c = "com.withings.missions.ui.viewmodels.MissionActivityViewModel$1", f = "MissionActivityViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f42324b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f42325c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MissionActivityViewModel.kt */
        @e(c = "com.withings.missions.ui.viewmodels.MissionActivityViewModel$1$1", f = "MissionActivityViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.withings.missions.ui.viewmodels.MissionActivityViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0562a extends i implements q<List<? extends c>, List<? extends Favorite>, qm0.d<? super List<? extends g00.a>>, Object> {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ List f42326a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ List f42327b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Context f42328c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ MissionActivityViewModel f42329d;

            /* compiled from: Comparisons.kt */
            /* renamed from: com.withings.missions.ui.viewmodels.MissionActivityViewModel$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0563a<T> implements Comparator {
                @Override // java.util.Comparator
                public final int compare(T t11, T t12) {
                    return pm0.a.b(Boolean.valueOf(((c) t11).j()), Boolean.valueOf(((c) t12).j()));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0562a(Context context, MissionActivityViewModel missionActivityViewModel, qm0.d<? super C0562a> dVar) {
                super(3, dVar);
                this.f42328c = context;
                this.f42329d = missionActivityViewModel;
            }

            @Override // ym0.q
            public final Object invoke(List<? extends c> list, List<? extends Favorite> list2, qm0.d<? super List<? extends g00.a>> dVar) {
                C0562a c0562a = new C0562a(this.f42328c, this.f42329d, dVar);
                c0562a.f42326a = list;
                c0562a.f42327b = list2;
                return c0562a.invokeSuspend(y.f85009a);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Comparator] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                l.b(obj);
                List D0 = x.D0(this.f42326a, new Object());
                ii.a a11 = this.f42329d.f42322c.a();
                ArrayList a12 = b.a(D0, this.f42328c, a11, this.f42327b);
                if (!(!a12.isEmpty())) {
                    return null;
                }
                return a12;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar, Context context, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f42324b = gVar;
            this.f42325c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f42324b, this.f42325c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            MissionActivityViewModel missionActivityViewModel = MissionActivityViewModel.this;
            d00.d dVar = missionActivityViewModel.f42321b;
            dVar.getClass();
            FlowKt.combine(FlowKt.transformLatest(w70.b.c(), new d00.b(null, dVar)), this.f42324b.a(), new C0562a(this.f42325c, missionActivityViewModel, null));
            return y.f85009a;
        }
    }

    @Inject
    public MissionActivityViewModel(d intentBuilder, or.a aVar, or.c cVar, d00.d dVar, ni.a aVar2, g gVar, Context context) {
        u.j(intentBuilder, "intentBuilder");
        this.f42320a = intentBuilder;
        this.f42321b = dVar;
        this.f42322c = aVar2;
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(gVar, context, null), 2, null);
    }
}
