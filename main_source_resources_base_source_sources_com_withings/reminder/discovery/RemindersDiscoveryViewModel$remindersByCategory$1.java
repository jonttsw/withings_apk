package com.withings.reminder.discovery;

import androidx.lifecycle.h0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.reminder.model.ReminderRepository;
import com.withings.reminder.model.ReminderType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RemindersDiscoveryActivity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/lifecycle/h0;", "", "", "", "Lcom/withings/reminder/model/ReminderType;", "Lnm0/y;", "<anonymous>", "(Landroidx/lifecycle/h0;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.reminder.discovery.RemindersDiscoveryViewModel$remindersByCategory$1", f = "RemindersDiscoveryActivity.kt", l = {ConstantsWs.MEASURE_TYPE_GLUCOSE_PERIOD}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RemindersDiscoveryViewModel$remindersByCategory$1 extends i implements p<h0<Map<String, ? extends List<? extends ReminderType>>>, d<? super y>, Object> {
    final /* synthetic */ ReminderRepository $reminderRepository;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemindersDiscoveryViewModel$remindersByCategory$1(ReminderRepository reminderRepository, d<? super RemindersDiscoveryViewModel$remindersByCategory$1> dVar) {
        super(2, dVar);
        this.$reminderRepository = reminderRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RemindersDiscoveryViewModel$remindersByCategory$1 remindersDiscoveryViewModel$remindersByCategory$1 = new RemindersDiscoveryViewModel$remindersByCategory$1(this.$reminderRepository, dVar);
        remindersDiscoveryViewModel$remindersByCategory$1.L$0 = obj;
        return remindersDiscoveryViewModel$remindersByCategory$1;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(h0<Map<String, List<ReminderType>>> h0Var, d<? super y> dVar) {
        return ((RemindersDiscoveryViewModel$remindersByCategory$1) create(h0Var, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            h0 h0Var = (h0) this.L$0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : this.$reminderRepository.getAllReminderTypes()) {
                String categoryName = ((ReminderType) obj2).getCategoryName();
                Object obj3 = linkedHashMap.get(categoryName);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap.put(categoryName, obj3);
                }
                ((List) obj3).add(obj2);
            }
            this.label = 1;
            if (h0Var.emit(linkedHashMap, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(h0<Map<String, ? extends List<? extends ReminderType>>> h0Var, d<? super y> dVar) {
        return invoke2((h0<Map<String, List<ReminderType>>>) h0Var, dVar);
    }
}
