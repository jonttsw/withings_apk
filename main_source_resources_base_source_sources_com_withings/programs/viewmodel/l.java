package com.withings.programs.viewmodel;

import com.withings.programs.model.MadeForYouLibraryUi;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AchieveViewModel.kt */
/* loaded from: classes4.dex */
public final class l<T> implements FlowCollector {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AchieveViewModel f43836a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(AchieveViewModel achieveViewModel) {
        this.f43836a = achieveViewModel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, qm0.d dVar) {
        MutableStateFlow mutableStateFlow;
        int i11;
        Integer valueOf;
        List list = (List) obj;
        mutableStateFlow = this.f43836a.f43784o;
        u.j(list, "<this>");
        List<am.g> list2 = list;
        ArrayList arrayList = new ArrayList(x.y(list2, 10));
        for (am.g gVar : list2) {
            String d11 = gVar.d();
            int ordinal = gVar.g().ordinal();
            if (ordinal != 0) {
                if (ordinal != 4) {
                    if (ordinal != 6) {
                        i11 = C1987R.string.coachConversation_articlePreview_tapToReadMore;
                    } else {
                        i11 = C1987R.string.content_suggestion_workout_cta;
                    }
                } else {
                    i11 = C1987R.string.content_suggestion_recipe_cta;
                }
            } else {
                i11 = C1987R.string.content_suggestion_article_cta;
            }
            int i12 = i11;
            String c11 = gVar.c();
            if (c11 == null) {
                c11 = "";
            }
            String str = c11;
            int ordinal2 = gVar.g().ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 4) {
                    if (ordinal2 != 6) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf((int) C1987R.string.programsTask_workoutCategory);
                    }
                } else {
                    valueOf = Integer.valueOf((int) C1987R.string.programsTask_recipeCategory);
                }
            } else {
                valueOf = Integer.valueOf((int) C1987R.string.programsTask_articleCategory);
            }
            arrayList.add(new MadeForYouLibraryUi(d11, i12, str, valueOf, gVar.f(), gVar.g()));
        }
        Object emit = mutableStateFlow.emit(arrayList, dVar);
        if (emit != CoroutineSingletons.f76214a) {
            return y.f85009a;
        }
        return emit;
    }
}
