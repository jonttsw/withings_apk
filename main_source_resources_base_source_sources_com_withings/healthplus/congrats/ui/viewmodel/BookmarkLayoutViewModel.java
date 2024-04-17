package com.withings.healthplus.congrats.ui.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.contentproviders.eightfit.model.webservice.TaskTypeExtensionKt;
import com.withings.contentproviders.model.content.TaskType;
import com.withings.healthplus.congrats.ui.model.SuccessTaskInfo;
import com.withings.library.authentication.api.ConstantsWs;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.l;
import nm0.y;
import or.c;
import or.h;
import qm0.d;
import ym0.p;
/* compiled from: BookmarkLayoutViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/congrats/ui/viewmodel/BookmarkLayoutViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BookmarkLayoutViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final or.a f40114a;

    /* renamed from: b  reason: collision with root package name */
    private final c f40115b;

    /* renamed from: c  reason: collision with root package name */
    private final xw.b f40116c;

    /* renamed from: d  reason: collision with root package name */
    private final h f40117d;

    /* renamed from: e  reason: collision with root package name */
    private final String f40118e;

    /* renamed from: f  reason: collision with root package name */
    private final SuccessTaskInfo f40119f;

    /* renamed from: g  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f40120g;

    /* renamed from: h  reason: collision with root package name */
    private final StateFlow<Boolean> f40121h;

    /* compiled from: BookmarkLayoutViewModel.kt */
    @e(c = "com.withings.healthplus.congrats.ui.viewmodel.BookmarkLayoutViewModel$1", f = "BookmarkLayoutViewModel.kt", l = {41, 43}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40122a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BookmarkLayoutViewModel.kt */
        /* renamed from: com.withings.healthplus.congrats.ui.viewmodel.BookmarkLayoutViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0523a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BookmarkLayoutViewModel f40124a;

            C0523a(BookmarkLayoutViewModel bookmarkLayoutViewModel) {
                this.f40124a = bookmarkLayoutViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, d dVar) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                Object emit = this.f40124a.f40120g.emit(bool, dVar);
                if (emit != CoroutineSingletons.f76214a) {
                    return y.f85009a;
                }
                return emit;
            }
        }

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40122a;
            BookmarkLayoutViewModel bookmarkLayoutViewModel = BookmarkLayoutViewModel.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.b(obj);
            } else {
                l.b(obj);
                h hVar = bookmarkLayoutViewModel.f40117d;
                String str = bookmarkLayoutViewModel.f40118e;
                this.f40122a = 1;
                obj = hVar.a(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            C0523a c0523a = new C0523a(bookmarkLayoutViewModel);
            this.f40122a = 2;
            if (((Flow) obj).collect(c0523a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return y.f85009a;
        }
    }

    /* compiled from: BookmarkLayoutViewModel.kt */
    @e(c = "com.withings.healthplus.congrats.ui.viewmodel.BookmarkLayoutViewModel$onBookmarkClicked$1$1", f = "BookmarkLayoutViewModel.kt", l = {54, 60}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40125a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f40127c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, d<? super b> dVar) {
            super(2, dVar);
            this.f40127c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new b(this.f40127c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40125a;
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.b(obj);
            } else {
                l.b(obj);
                BookmarkLayoutViewModel bookmarkLayoutViewModel = BookmarkLayoutViewModel.this;
                boolean booleanValue = bookmarkLayoutViewModel.m0().getValue().booleanValue();
                String str = ConstantsWs.WELLNESS_TASK_TYPE_VIDEO_WORKOUT;
                String str2 = this.f40127c;
                if (booleanValue) {
                    c cVar = bookmarkLayoutViewModel.f40115b;
                    List V = x.V(bookmarkLayoutViewModel.f40118e);
                    if (!u.e(str2, "workout")) {
                        str = str2;
                    }
                    this.f40125a = 1;
                    if (cVar.a(V, str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    or.a aVar = bookmarkLayoutViewModel.f40114a;
                    List V2 = x.V(bookmarkLayoutViewModel.f40118e);
                    if (!u.e(str2, "workout")) {
                        str = str2;
                    }
                    this.f40125a = 2;
                    if (aVar.a(V2, str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return y.f85009a;
        }
    }

    @Inject
    public BookmarkLayoutViewModel(u0 savedStateHandle, or.a aVar, c cVar, xw.b dispatcher, h hVar) {
        u.j(savedStateHandle, "savedStateHandle");
        u.j(dispatcher, "dispatcher");
        this.f40114a = aVar;
        this.f40115b = cVar;
        this.f40116c = dispatcher;
        this.f40117d = hVar;
        String str = (String) savedStateHandle.c("content_id");
        if (str != null) {
            this.f40118e = str;
            SuccessTaskInfo successTaskInfo = (SuccessTaskInfo) savedStateHandle.c("success_task_info");
            if (successTaskInfo != null) {
                this.f40119f = successTaskInfo;
                MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
                this.f40120g = MutableStateFlow;
                this.f40121h = FlowKt.asStateFlow(MutableStateFlow);
                BuildersKt__Builders_commonKt.launch$default(h1.a(this), dispatcher.a(), null, new a(null), 2, null);
                return;
            }
            throw new Exception("taskType shouldn't be null");
        }
        throw new Exception("ContentId shouldn't be null");
    }

    public final StateFlow<Boolean> m0() {
        return this.f40121h;
    }

    public final void p0() {
        String str;
        SuccessTaskInfo.f40094g.getClass();
        SuccessTaskInfo successTaskInfo = this.f40119f;
        u.j(successTaskInfo, "<this>");
        TaskType f11 = successTaskInfo.f();
        if (f11 != null) {
            str = TaskTypeExtensionKt.wsValue(f11);
        } else {
            str = null;
        }
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f40116c.a(), null, new b(str, null), 2, null);
        }
    }
}
