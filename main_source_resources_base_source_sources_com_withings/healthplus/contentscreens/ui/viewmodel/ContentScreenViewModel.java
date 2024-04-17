package com.withings.healthplus.contentscreens.ui.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.contentproviders.model.content.TaskType;
import com.withings.healthplus.contentscreens.ui.model.ContentCapability;
import com.withings.healthplus.contentscreens.ui.model.ContentScreenUi;
import com.withings.healthplus.contentscreens.ui.model.ContentState;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.l;
import nm0.y;
import nu.c;
import qm0.d;
import ym0.p;
/* compiled from: ContentScreenViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/viewmodel/ContentScreenViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class ContentScreenViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final MutableStateFlow<ContentState> f40185a;

    /* renamed from: b  reason: collision with root package name */
    private final StateFlow<ContentState> f40186b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<List<ContentCapability>> f40187c;

    /* renamed from: d  reason: collision with root package name */
    private final StateFlow<List<ContentCapability>> f40188d;

    /* renamed from: e  reason: collision with root package name */
    private final NavigationArguments.MissionInformation f40189e;

    /* renamed from: f  reason: collision with root package name */
    private final String f40190f;

    /* renamed from: g  reason: collision with root package name */
    private final long f40191g;

    /* renamed from: h  reason: collision with root package name */
    private final String f40192h;

    /* renamed from: i  reason: collision with root package name */
    private final NavigationArguments.ProgramInformation f40193i;

    /* compiled from: ContentScreenViewModel.kt */
    @e(c = "com.withings.healthplus.contentscreens.ui.viewmodel.ContentScreenViewModel$1", f = "ContentScreenViewModel.kt", l = {85, 87}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<ContentState, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40194a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f40195b;

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f40195b = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(ContentState contentState, d<? super y> dVar) {
            return ((a) create(contentState, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ContentState contentState;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40194a;
            ContentScreenViewModel contentScreenViewModel = ContentScreenViewModel.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                contentState = (ContentState) this.f40195b;
                l.b(obj);
            } else {
                l.b(obj);
                contentState = (ContentState) this.f40195b;
                if (contentState instanceof ContentState.Loaded) {
                    ContentScreenUi content = ((ContentState.Loaded) contentState).getContent();
                    this.f40195b = contentState;
                    this.f40194a = 1;
                    if (ContentScreenViewModel.g0(contentScreenViewModel, content, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            MutableStateFlow mutableStateFlow = contentScreenViewModel.f40185a;
            this.f40195b = null;
            this.f40194a = 2;
            if (mutableStateFlow.emit(contentState, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return y.f85009a;
        }
    }

    @Inject
    public ContentScreenViewModel(u0 savedStateHandle, nu.a retrieveLegacyTaskUiUseCase, c retrieveTaskUiUseCase) {
        Boolean bool;
        boolean z5;
        boolean z11;
        Flow<ContentState> c11;
        u.j(savedStateHandle, "savedStateHandle");
        u.j(retrieveLegacyTaskUiUseCase, "retrieveLegacyTaskUiUseCase");
        u.j(retrieveTaskUiUseCase, "retrieveTaskUiUseCase");
        MutableStateFlow<ContentState> MutableStateFlow = StateFlowKt.MutableStateFlow(ContentState.Loading.INSTANCE);
        this.f40185a = MutableStateFlow;
        this.f40186b = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<ContentCapability>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(i0.f76187a);
        this.f40187c = MutableStateFlow2;
        this.f40188d = FlowKt.asStateFlow(MutableStateFlow2);
        TaskType taskType = (TaskType) savedStateHandle.c(NavigationArguments.TASK_TYPE);
        if (taskType != null) {
            NavigationArguments.MissionInformation retrieveMissionInformation = NavigationArguments.MissionInformation.Companion.retrieveMissionInformation(savedStateHandle);
            this.f40189e = retrieveMissionInformation;
            String str = (String) savedStateHandle.c(NavigationArguments.CONTENT_ID);
            if (str != null) {
                this.f40190f = str;
                Long l5 = (Long) savedStateHandle.c(NavigationArguments.USER_ID);
                if (l5 != null) {
                    long longValue = l5.longValue();
                    this.f40191g = longValue;
                    String str2 = (String) savedStateHandle.c(NavigationArguments.ORIGINAL_CONTENT_ID_TO_BE_SWAPPED);
                    this.f40192h = str2;
                    NavigationArguments.ProgramInformation retrieveProgramInformation = NavigationArguments.ProgramInformation.Companion.retrieveProgramInformation(savedStateHandle);
                    this.f40193i = retrieveProgramInformation;
                    if (retrieveMissionInformation != null) {
                        bool = Boolean.valueOf(retrieveMissionInformation.isCompleted());
                    } else {
                        bool = null;
                    }
                    if (retrieveProgramInformation != null && str2 == null) {
                        c11 = retrieveLegacyTaskUiUseCase.d(str, retrieveProgramInformation.getInstanceId(), retrieveProgramInformation.getProgramId(), retrieveProgramInformation.getProgramTaskId(), taskType, longValue);
                    } else {
                        if (bool != null && !bool.booleanValue()) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if ((bool != null && !bool.booleanValue()) || str2 != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c11 = c.c(retrieveTaskUiUseCase, str, longValue, z5, z11);
                    }
                    FlowKt.launchIn(FlowKt.onEach(c11, new a(null)), CoroutineScopeKt.plus(h1.a(this), Dispatchers.getIO()));
                    return;
                }
                throw new Exception("userId shouldn't be null");
            }
            throw new Exception("contentId shouldn't be null");
        }
        throw new Exception("taskType shouldn't be null");
    }

    public static final Object g0(ContentScreenViewModel contentScreenViewModel, ContentScreenUi contentScreenUi, d dVar) {
        contentScreenViewModel.getClass();
        ArrayList arrayList = new ArrayList();
        if (contentScreenUi.getCanBeFavorite()) {
            arrayList.add(ContentCapability.Favorite.INSTANCE);
        }
        if (contentScreenUi.getCanTts()) {
            arrayList.add(ContentCapability.TextToSpeech.INSTANCE);
        }
        if (contentScreenUi.getCanBeCompleted()) {
            arrayList.add(ContentCapability.Completable.INSTANCE);
        }
        if (contentScreenUi.getCanBeSwap() || contentScreenViewModel.f40192h == null) {
            arrayList.add(ContentCapability.Swappable.INSTANCE);
        }
        Object emit = contentScreenViewModel.f40187c.emit(arrayList, dVar);
        if (emit != CoroutineSingletons.f76214a) {
            return y.f85009a;
        }
        return emit;
    }

    public final StateFlow<List<ContentCapability>> i0() {
        return this.f40188d;
    }

    public final String j0() {
        return this.f40190f;
    }

    public final StateFlow<ContentState> k0() {
        return this.f40186b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final NavigationArguments.MissionInformation m0() {
        return this.f40189e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String p0() {
        return this.f40192h;
    }

    public final NavigationArguments.ProgramInformation q0() {
        return this.f40193i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long r0() {
        return this.f40191g;
    }
}
