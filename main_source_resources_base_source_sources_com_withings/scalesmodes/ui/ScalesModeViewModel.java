package com.withings.scalesmodes.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.scalesmodes.core.ScalesModes;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import nm0.y;
/* compiled from: ScalesModeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/scalesmodes/ui/ScalesModeViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ScalesModeViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final ch.d f43902a;

    /* renamed from: b  reason: collision with root package name */
    private final Device f43903b;

    /* renamed from: c  reason: collision with root package name */
    private final long f43904c;

    /* renamed from: d  reason: collision with root package name */
    private final StateFlow<List<c>> f43905d;

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Flow<List<? extends c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f43906a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ y60.a f43907b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ScalesModeViewModel f43908c;

        /* compiled from: Emitters.kt */
        /* renamed from: com.withings.scalesmodes.ui.ScalesModeViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0597a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f43909a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ y60.a f43910b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ScalesModeViewModel f43911c;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.scalesmodes.ui.ScalesModeViewModel$special$$inlined$map$1$2", f = "ScalesModeViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGACCOUNTID, 223}, m = "emit")
            /* renamed from: com.withings.scalesmodes.ui.ScalesModeViewModel$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0598a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f43912a;

                /* renamed from: b  reason: collision with root package name */
                int f43913b;

                /* renamed from: c  reason: collision with root package name */
                C0597a f43914c;

                /* renamed from: e  reason: collision with root package name */
                FlowCollector f43916e;

                /* renamed from: f  reason: collision with root package name */
                Collection f43917f;

                /* renamed from: g  reason: collision with root package name */
                Iterator f43918g;

                /* renamed from: h  reason: collision with root package name */
                ScalesModes f43919h;

                public C0598a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f43912a = obj;
                    this.f43913b |= Integer.MIN_VALUE;
                    return C0597a.this.emit(null, this);
                }
            }

            public C0597a(FlowCollector flowCollector, y60.a aVar, ScalesModeViewModel scalesModeViewModel) {
                this.f43909a = flowCollector;
                this.f43910b = aVar;
                this.f43911c = scalesModeViewModel;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
            /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Collection] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0078 -> B:55:0x0114). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:55:0x0114). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d2 -> B:41:0x00d7). Please submit an issue!!! */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r18, qm0.d r19) {
                /*
                    Method dump skipped, instructions count: 309
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.scalesmodes.ui.ScalesModeViewModel.a.C0597a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public a(Flow flow, y60.a aVar, ScalesModeViewModel scalesModeViewModel) {
            this.f43906a = flow;
            this.f43907b = aVar;
            this.f43908c = scalesModeViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<? extends c>> flowCollector, qm0.d dVar) {
            Object collect = this.f43906a.collect(new C0597a(flowCollector, this.f43907b, this.f43908c), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    @Inject
    public ScalesModeViewModel(u0 savedStateHandle, vr.d featureTagsRepository, y60.a aVar, ch.d intentBuilder) {
        u.j(savedStateHandle, "savedStateHandle");
        u.j(featureTagsRepository, "featureTagsRepository");
        u.j(intentBuilder, "intentBuilder");
        this.f43902a = intentBuilder;
        Object c11 = savedStateHandle.c("device");
        u.g(c11);
        Device device = (Device) c11;
        this.f43903b = device;
        Object c12 = savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        u.g(c12);
        this.f43904c = ((Number) c12).longValue();
        this.f43905d = FlowKt.stateIn(new a(featureTagsRepository.get(device.getId()), aVar, this), h1.a(this), SharingStarted.Companion.getEagerly(), i0.f76187a);
    }

    public final Device f0() {
        return this.f43903b;
    }

    public final ch.d g0() {
        return this.f43902a;
    }

    public final StateFlow<List<c>> i0() {
        return this.f43905d;
    }

    public final long j0() {
        return this.f43904c;
    }
}
