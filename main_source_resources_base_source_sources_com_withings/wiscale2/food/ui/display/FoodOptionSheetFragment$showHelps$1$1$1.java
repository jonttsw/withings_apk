package com.withings.wiscale2.food.ui.display;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.learnmore.adapter.LearnMoreEntry;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.ui.LearnMoreSimpleListKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import yk.o;
import ym0.l;
import ym0.p;
/* compiled from: FoodOptionSheetFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class FoodOptionSheetFragment$showHelps$1$1$1 extends w implements p<androidx.compose.runtime.a, Integer, y> {
    final /* synthetic */ List<LearnMoreEntryTranslations> $list;
    final /* synthetic */ FoodOptionSheetFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodOptionSheetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.wiscale2.food.ui.display.FoodOptionSheetFragment$showHelps$1$1$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends w implements p<androidx.compose.runtime.a, Integer, y> {
        final /* synthetic */ List<LearnMoreEntryTranslations> $list;
        final /* synthetic */ FoodOptionSheetFragment this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FoodOptionSheetFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withings/learnmore/adapter/LearnMoreEntry;", "<name for destructuring parameter 0>", "Lnm0/y;", "invoke", "(Lcom/withings/learnmore/adapter/LearnMoreEntry;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.wiscale2.food.ui.display.FoodOptionSheetFragment$showHelps$1$1$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C07371 extends w implements l<LearnMoreEntry, y> {
            final /* synthetic */ FoodOptionSheetFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C07371(FoodOptionSheetFragment foodOptionSheetFragment) {
                super(1);
                this.this$0 = foodOptionSheetFragment;
            }

            @Override // ym0.l
            public /* bridge */ /* synthetic */ y invoke(LearnMoreEntry learnMoreEntry) {
                invoke2(learnMoreEntry);
                return y.f85009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(LearnMoreEntry learnMoreEntry) {
                u.j(learnMoreEntry, "<name for destructuring parameter 0>");
                String component1 = learnMoreEntry.component1();
                String component2 = learnMoreEntry.component2();
                FoodOptionSheetFragment foodOptionSheetFragment = this.this$0;
                HMWebActivity.a aVar = HMWebActivity.f35395c;
                Context context = foodOptionSheetFragment.getHelpsSection().getContext();
                u.i(context, "getContext(...)");
                foodOptionSheetFragment.startActivity(aVar.c(context, component2, component1));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<LearnMoreEntryTranslations> list, FoodOptionSheetFragment foodOptionSheetFragment) {
            super(2);
            this.$list = list;
            this.this$0 = foodOptionSheetFragment;
        }

        @Override // ym0.p
        public /* bridge */ /* synthetic */ y invoke(androidx.compose.runtime.a aVar, Integer num) {
            invoke(aVar, num.intValue());
            return y.f85009a;
        }

        public final void invoke(androidx.compose.runtime.a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.h()) {
                aVar.C();
            } else {
                LearnMoreSimpleListKt.LearnMoreSimpleList(this.$list, new C07371(this.this$0), aVar, 8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodOptionSheetFragment$showHelps$1$1$1(List<LearnMoreEntryTranslations> list, FoodOptionSheetFragment foodOptionSheetFragment) {
        super(2);
        this.$list = list;
        this.this$0 = foodOptionSheetFragment;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(androidx.compose.runtime.a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.h()) {
            aVar.C();
        } else {
            o.b(false, s1.b.b(aVar, -313010458, new AnonymousClass1(this.$list, this.this$0)), aVar, 48, 1);
        }
    }
}
