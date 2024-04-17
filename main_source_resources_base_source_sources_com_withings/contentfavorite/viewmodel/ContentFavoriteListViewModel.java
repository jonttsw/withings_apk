package com.withings.contentfavorite.viewmodel;

import ah.e;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.favorite.model.FavoriteCategory;
import com.withings.favorite.model.FavoriteCategoryKt;
import com.withings.favorite.model.FavoriteSegmentedCategory;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import ek.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.l;
import nm0.y;
import qk.f6;
import qk.fa;
import qk.yd;
import qk.z5;
import retrofit.RetrofitError;
import tl.d;
import xl.a;
import xl.b;
import ym0.p;
import ym0.q;
/* compiled from: ContentFavoriteListViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/contentfavorite/viewmodel/ContentFavoriteListViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ContentFavoriteListViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final e f35263a;

    /* renamed from: b  reason: collision with root package name */
    private final yl.a f35264b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<xl.b> f35265c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableStateFlow f35266d;

    /* renamed from: e  reason: collision with root package name */
    private final rl.b f35267e;

    /* renamed from: f  reason: collision with root package name */
    private Job f35268f;

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Flow<List<? extends d.b>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f35269a;

        /* compiled from: Emitters.kt */
        /* renamed from: com.withings.contentfavorite.viewmodel.ContentFavoriteListViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0460a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f35270a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.contentfavorite.viewmodel.ContentFavoriteListViewModel$fetchContent$$inlined$map$1$2", f = "ContentFavoriteListViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.contentfavorite.viewmodel.ContentFavoriteListViewModel$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0461a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f35271a;

                /* renamed from: b  reason: collision with root package name */
                int f35272b;

                public C0461a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f35271a = obj;
                    this.f35272b |= Integer.MIN_VALUE;
                    return C0460a.this.emit(null, this);
                }
            }

            public C0460a(FlowCollector flowCollector) {
                this.f35270a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r24, qm0.d r25) {
                /*
                    Method dump skipped, instructions count: 258
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.contentfavorite.viewmodel.ContentFavoriteListViewModel.a.C0460a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public a(Flow flow) {
            this.f35269a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<? extends d.b>> flowCollector, qm0.d dVar) {
            Object collect = this.f35269a.collect(new C0460a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContentFavoriteListViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.contentfavorite.viewmodel.ContentFavoriteListViewModel$fetchContent$2", f = "ContentFavoriteListViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends i implements q<List<? extends FavoriteSegmentedCategory>, List<? extends d.b>, qm0.d<? super b.C1891b>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f35274a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ List f35275b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f35276c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ContentFavoriteListViewModel f35277d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, ContentFavoriteListViewModel contentFavoriteListViewModel, qm0.d<? super b> dVar) {
            super(3, dVar);
            this.f35276c = i11;
            this.f35277d = contentFavoriteListViewModel;
        }

        @Override // ym0.q
        public final Object invoke(List<? extends FavoriteSegmentedCategory> list, List<? extends d.b> list2, qm0.d<? super b.C1891b> dVar) {
            b bVar = new b(this.f35276c, this.f35277d, dVar);
            bVar.f35274a = list;
            bVar.f35275b = list2;
            return bVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i11;
            boolean z5;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            List list = this.f35274a;
            List list2 = this.f35275b;
            u.j(list, "<this>");
            List list3 = list;
            ArrayList arrayList = new ArrayList(x.y(list3, 10));
            Iterator it = list3.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                i11 = this.f35276c;
                if (!hasNext) {
                    break;
                }
                FavoriteSegmentedCategory favoriteSegmentedCategory = (FavoriteSegmentedCategory) it.next();
                if (favoriteSegmentedCategory.getPriority() == i11) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                arrayList.add(new a.b(favoriteSegmentedCategory.getPriority(), z5, favoriteSegmentedCategory.getDisplayName(), favoriteSegmentedCategory.getAnalyticsValue(), null, 16));
            }
            ArrayList arrayList2 = new ArrayList();
            int priority = FavoriteSegmentedCategory.All.getPriority();
            ContentFavoriteListViewModel contentFavoriteListViewModel = this.f35277d;
            if (i11 == priority) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((a.b) next).c() != FavoriteSegmentedCategory.All.getPriority()) {
                        arrayList3.add(next);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    a.b bVar = (a.b) it3.next();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (((d.b) obj2).a().getPriority() == bVar.c()) {
                            arrayList4.add(obj2);
                        }
                    }
                    arrayList2.add(new d.c(bVar.e(), arrayList4.size()));
                    if (arrayList4.isEmpty()) {
                        arrayList2.add(ContentFavoriteListViewModel.f0(contentFavoriteListViewModel, bVar.c()));
                    } else {
                        arrayList2.addAll(arrayList4);
                    }
                }
            } else {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : list2) {
                    if (((d.b) obj3).a().getPriority() == i11) {
                        arrayList5.add(obj3);
                    }
                }
                if (arrayList5.isEmpty()) {
                    arrayList2.add(ContentFavoriteListViewModel.f0(contentFavoriteListViewModel, ((a.b) arrayList.get(i11)).c()));
                } else {
                    arrayList2.addAll(arrayList5);
                }
            }
            return new b.C1891b(arrayList, arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContentFavoriteListViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.contentfavorite.viewmodel.ContentFavoriteListViewModel$fetchContent$3", f = "ContentFavoriteListViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_HR_STATE}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends i implements p<b.C1891b, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35278a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f35279b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ContentFavoriteListViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.contentfavorite.viewmodel.ContentFavoriteListViewModel$fetchContent$3$1", f = "ContentFavoriteListViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_HR_STATE}, m = "invokeSuspend")
        /* loaded from: classes3.dex */
        public static final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35281a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ContentFavoriteListViewModel f35282b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b.C1891b f35283c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ContentFavoriteListViewModel contentFavoriteListViewModel, b.C1891b c1891b, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f35282b = contentFavoriteListViewModel;
                this.f35283c = c1891b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f35282b, this.f35283c, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f35281a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    l.b(obj);
                    MutableStateFlow mutableStateFlow = this.f35282b.f35265c;
                    this.f35281a = 1;
                    if (mutableStateFlow.emit(this.f35283c, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return y.f85009a;
            }
        }

        c(qm0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f35279b = obj;
            return cVar;
        }

        @Override // ym0.p
        public final Object invoke(b.C1891b c1891b, qm0.d<? super y> dVar) {
            return ((c) create(c1891b, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f35278a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(ContentFavoriteListViewModel.this, (b.C1891b) this.f35279b, null);
                this.f35278a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: ContentFavoriteListViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.contentfavorite.viewmodel.ContentFavoriteListViewModel$synchronizeContentFavoriteIfNeeded$1", f = "ContentFavoriteListViewModel.kt", l = {74, 76}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35284a;

        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new d(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ContentFavoriteListViewModel contentFavoriteListViewModel = ContentFavoriteListViewModel.this;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f35284a;
            if (i11 != 0) {
                if (i11 == 1 || i11 == 2) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                try {
                    contentFavoriteListViewModel.f35267e.run();
                } catch (RetrofitError unused) {
                    MutableStateFlow mutableStateFlow = contentFavoriteListViewModel.f35265c;
                    b.a aVar = new b.a(a.b.f107357a);
                    this.f35284a = 1;
                    if (mutableStateFlow.emit(aVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Exception unused2) {
                    MutableStateFlow mutableStateFlow2 = contentFavoriteListViewModel.f35265c;
                    b.a aVar2 = new b.a(a.C1887a.f107352a);
                    this.f35284a = 2;
                    if (mutableStateFlow2.emit(aVar2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return y.f85009a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Inject
    public ContentFavoriteListViewModel(u0 savedStateHandle, rl.c synchronizeContentFavoritesFactory, e eVar, yl.a aVar) {
        int i11;
        u.j(savedStateHandle, "savedStateHandle");
        u.j(synchronizeContentFavoritesFactory, "synchronizeContentFavoritesFactory");
        this.f35263a = eVar;
        this.f35264b = aVar;
        MutableStateFlow<xl.b> MutableStateFlow = StateFlowKt.MutableStateFlow(b.c.f107365a);
        this.f35265c = MutableStateFlow;
        this.f35266d = MutableStateFlow;
        String str = (String) savedStateHandle.c("taskCategory");
        if (str != null) {
            Long l5 = (Long) savedStateHandle.c(NavigationArguments.USER_ID);
            if (l5 != null) {
                this.f35267e = synchronizeContentFavoritesFactory.a(l5.longValue());
                switch (str.hashCode()) {
                    case -1984262325:
                        if (str.equals(ConstantsWs.WELLNESS_TASK_TYPE_VIDEO_WORKOUT)) {
                            i11 = FavoriteSegmentedCategory.Workout.getPriority();
                            break;
                        }
                        i11 = -1;
                        break;
                    case -934914674:
                        if (str.equals(ConstantsWs.WELLNESS_TASK_TYPE_RECIPE)) {
                            i11 = FavoriteSegmentedCategory.Recipe.getPriority();
                            break;
                        }
                        i11 = -1;
                        break;
                    case -732377866:
                        if (str.equals(ConstantsWs.WELLNESS_TASK_TYPE_ARTICLE)) {
                            i11 = FavoriteSegmentedCategory.Article.getPriority();
                            break;
                        }
                        i11 = -1;
                        break;
                    case 65921:
                        if (str.equals(FavoriteCategoryKt.SEGMENTED_ITEM_ALL_KEY)) {
                            i11 = FavoriteSegmentedCategory.All.getPriority();
                            break;
                        }
                        i11 = -1;
                        break;
                    default:
                        i11 = -1;
                        break;
                }
                j0(i11);
                return;
            }
            throw new Exception("userId shouldn't be null");
        }
        throw new Exception("Task category shouldn't be null");
    }

    public static final d.a f0(ContentFavoriteListViewModel contentFavoriteListViewModel, int i11) {
        contentFavoriteListViewModel.getClass();
        if (i11 == FavoriteSegmentedCategory.Article.getPriority()) {
            return new d.a(FavoriteCategory.Article, fa.f92926a, Integer.valueOf((int) C1987R.string.bookmark_libraryScreen_emptyStateArticle));
        }
        if (i11 == FavoriteSegmentedCategory.Recipe.getPriority()) {
            return new d.a(FavoriteCategory.Recipe, f6.f92922a, Integer.valueOf((int) C1987R.string.bookmark_libraryScreen_emptyStateRecipe));
        }
        if (i11 == FavoriteSegmentedCategory.Workout.getPriority()) {
            return new d.a(FavoriteCategory.Workout, z5.f93226a, Integer.valueOf((int) C1987R.string.bookmark_libraryScreen_emptyStateWorkout));
        }
        return new d.a(FavoriteCategory.Unknown, yd.f93219a, Integer.valueOf((int) C1987R.string.bookmark_libraryScreen_emptyStateOthers));
    }

    private final void j0(int i11) {
        List<? extends FavoriteCategory> list;
        this.f35263a.getClass();
        Flow flowOf = FlowKt.flowOf(FavoriteSegmentedCategory.getEntries());
        if (i11 == FavoriteSegmentedCategory.Article.getPriority()) {
            list = x.W(FavoriteCategory.Article, FavoriteCategory.Discovery);
        } else if (i11 == FavoriteSegmentedCategory.Recipe.getPriority()) {
            list = x.V(FavoriteCategory.Recipe);
        } else if (i11 == FavoriteSegmentedCategory.Workout.getPriority()) {
            list = x.V(FavoriteCategory.Workout);
        } else {
            list = i0.f76187a;
        }
        FlowKt.launchIn(FlowKt.onEach(FlowKt.flowOn(FlowKt.combine(flowOf, new a(this.f35264b.a(list)), new b(i11, this, null)), Dispatchers.getIO()), new c(null)), h1.a(this));
    }

    public final MutableStateFlow k0() {
        return this.f35266d;
    }

    public final void m0(ek.a segmentedItem) {
        u.j(segmentedItem, "segmentedItem");
        String a11 = segmentedItem.a();
        if (a11 != null) {
            nl.a.b(a11);
        }
        j0(segmentedItem.c());
    }

    public final void p0() {
        Job launch$default;
        Job job = this.f35268f;
        if (job == null || (job != null && !job.isActive())) {
            Job job2 = this.f35268f;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, null, 1, null);
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new d(null), 2, null);
            this.f35268f = launch$default;
            if (launch$default != null) {
                launch$default.start();
            }
        }
    }
}
