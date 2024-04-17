package com.withings.badge.profile;

import android.app.Application;
import androidx.lifecycle.h1;
import com.withings.badge.profile.d;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import m70.i;
import nm0.y;
/* compiled from: ProfileBadgeCarouselViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/badge/profile/ProfileBadgeCarouselViewModel;", "Landroidx/lifecycle/b;", "badge_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ProfileBadgeCarouselViewModel extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final bi.a f32846a;

    /* renamed from: b  reason: collision with root package name */
    private final StateFlow<d> f32847b;

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Flow<d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f32848a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileBadgeCarouselViewModel f32849b;

        /* compiled from: Emitters.kt */
        /* renamed from: com.withings.badge.profile.ProfileBadgeCarouselViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0441a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f32850a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ProfileBadgeCarouselViewModel f32851b;

            /* compiled from: Emitters.kt */
            @e(c = "com.withings.badge.profile.ProfileBadgeCarouselViewModel$special$$inlined$map$1$2", f = "ProfileBadgeCarouselViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.badge.profile.ProfileBadgeCarouselViewModel$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0442a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f32852a;

                /* renamed from: b  reason: collision with root package name */
                int f32853b;

                public C0442a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f32852a = obj;
                    this.f32853b |= Integer.MIN_VALUE;
                    return C0441a.this.emit(null, this);
                }
            }

            public C0441a(FlowCollector flowCollector, ProfileBadgeCarouselViewModel profileBadgeCarouselViewModel) {
                this.f32850a = flowCollector;
                this.f32851b = profileBadgeCarouselViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, qm0.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.withings.badge.profile.ProfileBadgeCarouselViewModel.a.C0441a.C0442a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.withings.badge.profile.ProfileBadgeCarouselViewModel$a$a$a r0 = (com.withings.badge.profile.ProfileBadgeCarouselViewModel.a.C0441a.C0442a) r0
                    int r1 = r0.f32853b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f32853b = r1
                    goto L18
                L13:
                    com.withings.badge.profile.ProfileBadgeCarouselViewModel$a$a$a r0 = new com.withings.badge.profile.ProfileBadgeCarouselViewModel$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f32852a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f32853b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r8)
                    goto L7c
                L27:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L2f:
                    nm0.l.b(r8)
                    java.util.List r7 = (java.util.List) r7
                    boolean r8 = r7.isEmpty()
                    if (r8 == 0) goto L3d
                    com.withings.badge.profile.d$c r7 = com.withings.badge.profile.d.c.f32880a
                    goto L71
                L3d:
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r2 = 10
                    int r2 = kotlin.collections.x.y(r7, r2)
                    r8.<init>(r2)
                    java.util.Iterator r7 = r7.iterator()
                L4e:
                    boolean r2 = r7.hasNext()
                    if (r2 == 0) goto L6c
                    java.lang.Object r2 = r7.next()
                    ai.a r2 = (ai.a) r2
                    com.withings.badge.profile.ProfileBadgeCarouselViewModel r4 = r6.f32851b
                    bi.a r5 = com.withings.badge.profile.ProfileBadgeCarouselViewModel.f0(r4)
                    android.app.Application r4 = r4.getApplication()
                    com.withings.badge.model.BadgeModelUI$UnlockedBadgeModelUI r2 = com.withings.badge.model.BadgeModelUIKt.toUnlockedUIModel(r2, r5, r4)
                    r8.add(r2)
                    goto L4e
                L6c:
                    com.withings.badge.profile.d$a r7 = new com.withings.badge.profile.d$a
                    r7.<init>(r8)
                L71:
                    r0.f32853b = r3
                    kotlinx.coroutines.flow.FlowCollector r8 = r6.f32850a
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L7c
                    return r1
                L7c:
                    nm0.y r7 = nm0.y.f85009a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.badge.profile.ProfileBadgeCarouselViewModel.a.C0441a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public a(Flow flow, ProfileBadgeCarouselViewModel profileBadgeCarouselViewModel) {
            this.f32848a = flow;
            this.f32849b = profileBadgeCarouselViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super d> flowCollector, qm0.d dVar) {
            Object collect = this.f32848a.collect(new C0441a(flowCollector, this.f32849b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ProfileBadgeCarouselViewModel(Application application, i userManager, zh.a repository, bi.a aVar) {
        super(application);
        u.j(userManager, "userManager");
        u.j(repository, "repository");
        this.f32846a = aVar;
        this.f32847b = FlowKt.stateIn(new a(repository.d(userManager.e().q()), this), h1.a(this), SharingStarted.Companion.getEagerly(), d.b.f32879a);
    }

    public final StateFlow<d> g0() {
        return this.f32847b;
    }
}
