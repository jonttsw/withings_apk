package com.withings.vasistas.v2.ktx;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.vasistas.v2.model.Vasistas;
import com.withings.vasistas.v2.repository.VasistasRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: VasistasRepository.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aL\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001aR\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0004\b\u000e\u0010\u000f\u001aF\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0086H¢\u0006\u0004\b\u000e\u0010\u0010\u001aO\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012\u001aF\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withings/vasistas/v2/model/Vasistas;", "T", "Lcom/withings/vasistas/v2/repository/VasistasRepository;", "", NavigationArguments.USER_ID, "Lorg/joda/time/DateTime;", "from", "to", "Lkotlinx/coroutines/flow/Flow;", "", "get", "(Lcom/withings/vasistas/v2/repository/VasistasRepository;JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lkotlinx/coroutines/flow/Flow;", "Ljava/lang/Class;", "vasistasClass", "getOnce", "(Lcom/withings/vasistas/v2/repository/VasistasRepository;Ljava/lang/Class;JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lqm0/d;)Ljava/lang/Object;", "(Lcom/withings/vasistas/v2/repository/VasistasRepository;JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lqm0/d;)Ljava/lang/Object;", "getOnceBlocking", "(Lcom/withings/vasistas/v2/repository/VasistasRepository;Ljava/lang/Class;JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Ljava/util/List;", "(Lcom/withings/vasistas/v2/repository/VasistasRepository;JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Ljava/util/List;", "core"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class VasistasRepositoryKt {
    public static final /* synthetic */ <T extends Vasistas> Flow<List<T>> get(VasistasRepository vasistasRepository, long j5, DateTime dateTime, DateTime dateTime2) {
        u.j(vasistasRepository, "<this>");
        u.o();
        throw null;
    }

    public static /* synthetic */ Flow get$default(VasistasRepository vasistasRepository, long j5, DateTime dateTime, DateTime dateTime2, int i11, Object obj) {
        u.j(vasistasRepository, "<this>");
        u.o();
        throw null;
    }

    public static final <T extends Vasistas> Object getOnce(VasistasRepository vasistasRepository, Class<T> cls, long j5, DateTime dateTime, DateTime dateTime2, d<? super List<? extends T>> dVar) {
        return FlowKt.first(vasistasRepository.get(cls, j5, dateTime, dateTime2), dVar);
    }

    public static final <T extends Vasistas> List<T> getOnceBlocking(VasistasRepository vasistasRepository, Class<T> vasistasClass, long j5, DateTime dateTime, DateTime dateTime2) {
        Object runBlocking$default;
        u.j(vasistasRepository, "<this>");
        u.j(vasistasClass, "vasistasClass");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new VasistasRepositoryKt$getOnceBlocking$1(vasistasRepository, vasistasClass, j5, dateTime, dateTime2, null), 1, null);
        return (List) runBlocking$default;
    }

    public static final /* synthetic */ <T extends Vasistas> Object getOnce(VasistasRepository vasistasRepository, long j5, DateTime dateTime, DateTime dateTime2, d<? super List<? extends T>> dVar) {
        u.o();
        throw null;
    }

    public static final /* synthetic */ <T extends Vasistas> List<T> getOnceBlocking(VasistasRepository vasistasRepository, long j5, DateTime dateTime, DateTime dateTime2) {
        u.j(vasistasRepository, "<this>");
        u.o();
        throw null;
    }

    public static /* synthetic */ List getOnceBlocking$default(VasistasRepository vasistasRepository, long j5, DateTime dateTime, DateTime dateTime2, int i11, Object obj) {
        u.j(vasistasRepository, "<this>");
        u.o();
        throw null;
    }

    public static /* synthetic */ Object getOnce$default(VasistasRepository vasistasRepository, long j5, DateTime dateTime, DateTime dateTime2, d dVar, int i11, Object obj) {
        u.o();
        throw null;
    }
}
