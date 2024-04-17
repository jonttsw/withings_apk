package com.withings.vasistas.v2.repository;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.vasistas.model.Vasistas;
import com.withings.vasistas.v2.domain.mappers.AhiVasistasMapper;
import com.withings.vasistas.v2.domain.mappers.BedVasistasMapper;
import com.withings.vasistas.v2.domain.mappers.BodyVasistasMapper;
import com.withings.vasistas.v2.domain.mappers.CoreTemperatureVasistasMapper;
import com.withings.vasistas.v2.domain.mappers.ElevationVasistasMapper;
import com.withings.vasistas.v2.domain.mappers.MotionVasistasMapper;
import com.withings.vasistas.v2.domain.mappers.PauseVasistasMapper;
import com.withings.vasistas.v2.domain.mappers.Spo2VasistasMapper;
import com.withings.vasistas.v2.domain.mappers.SwimVasistasMapper;
import com.withings.vasistas.v2.domain.mappers.TrackerSleepVasistasMapper;
import com.withings.vasistas.v2.model.AhiVasistas;
import com.withings.vasistas.v2.model.BedVasistas;
import com.withings.vasistas.v2.model.BodyVasistas;
import com.withings.vasistas.v2.model.CoreTemperatureVasistas;
import com.withings.vasistas.v2.model.ElevationVasistas;
import com.withings.vasistas.v2.model.MotionVasistas;
import com.withings.vasistas.v2.model.PauseVasistas;
import com.withings.vasistas.v2.model.Spo2Vasistas;
import com.withings.vasistas.v2.model.SwimVasistas;
import com.withings.vasistas.v2.model.TrackerSleepVasistas;
import com.withings.vasistas.ws.WsVasistasSerie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: SqlVasistasRepository.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*J9\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0019*\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u001aJO\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u001b\"\b\b\u0000\u0010\u0019*\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010\u001e\u001a\u0004\u0018\u00010\u0012\"\b\b\u0000\u0010\u0019*\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010\"\u001a\u00020!\"\b\b\u0000\u0010\u0019*\u00020\u00122\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096@¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020!H\u0096@¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/withings/vasistas/v2/repository/SqlVasistasRepository;", "Lcom/withings/vasistas/v2/repository/VasistasRepository;", "Lcom/withings/vasistas/model/Vasistas$Category;", "category", "", NavigationArguments.USER_ID, "Lorg/joda/time/DateTime;", "from", "to", "", "Lcom/withings/vasistas/model/Vasistas;", "getSqlVasistas", "(Lcom/withings/vasistas/model/Vasistas$Category;JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Ljava/util/List;", "getHackedElevationVasistas", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Ljava/util/List;", "getCategoriesRelatedTo", "(Lcom/withings/vasistas/model/Vasistas$Category;)Ljava/util/List;", "Ljava/lang/Class;", "Lcom/withings/vasistas/v2/model/Vasistas;", "vasistasClass", "getCategoryFor", "(Ljava/lang/Class;)Lcom/withings/vasistas/model/Vasistas$Category;", WsVasistasSerie.KEY_VASISTAS, "map", "(Lcom/withings/vasistas/v2/model/Vasistas;)Lcom/withings/vasistas/model/Vasistas;", "T", "(Ljava/lang/Class;Lcom/withings/vasistas/model/Vasistas;)Lcom/withings/vasistas/v2/model/Vasistas;", "Lkotlinx/coroutines/flow/Flow;", "get", "(Ljava/lang/Class;JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lkotlinx/coroutines/flow/Flow;", "getLastVasistas", "(Ljava/lang/Class;J)Lcom/withings/vasistas/v2/model/Vasistas;", "vasistasList", "Lnm0/y;", "add", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "synchronize", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/vasistas/v2/repository/SqlVasistasDao;", "sqlVasistasDao", "Lcom/withings/vasistas/v2/repository/SqlVasistasDao;", "<init>", "(Lcom/withings/vasistas/v2/repository/SqlVasistasDao;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SqlVasistasRepository implements VasistasRepository {
    private final SqlVasistasDao sqlVasistasDao;

    /* compiled from: SqlVasistasRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Vasistas.Category.values().length];
            try {
                iArr[Vasistas.Category.ELEVATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public SqlVasistasRepository(SqlVasistasDao sqlVasistasDao) {
        u.j(sqlVasistasDao, "sqlVasistasDao");
        this.sqlVasistasDao = sqlVasistasDao;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Vasistas.Category> getCategoriesRelatedTo(Vasistas.Category category) {
        if (WhenMappings.$EnumSwitchMapping$0[category.ordinal()] == 1) {
            return x.W(category, Vasistas.Category.MOTION);
        }
        return x.V(category);
    }

    private final Vasistas.Category getCategoryFor(Class<? extends com.withings.vasistas.v2.model.Vasistas> cls) {
        if (u.e(cls, AhiVasistas.class)) {
            return Vasistas.Category.AHI;
        }
        if (u.e(cls, BedVasistas.class)) {
            return Vasistas.Category.BED;
        }
        if (u.e(cls, BodyVasistas.class)) {
            return Vasistas.Category.BODY;
        }
        if (u.e(cls, ElevationVasistas.class)) {
            return Vasistas.Category.ELEVATION;
        }
        if (u.e(cls, MotionVasistas.class)) {
            return Vasistas.Category.MOTION;
        }
        if (u.e(cls, PauseVasistas.class)) {
            return Vasistas.Category.PAUSE;
        }
        if (u.e(cls, Spo2Vasistas.class)) {
            return Vasistas.Category.SPO2;
        }
        if (u.e(cls, SwimVasistas.class)) {
            return Vasistas.Category.SWIM;
        }
        if (u.e(cls, TrackerSleepVasistas.class)) {
            return Vasistas.Category.MOTION;
        }
        if (u.e(cls, CoreTemperatureVasistas.class)) {
            return Vasistas.Category.CORE_TEMPERATURE;
        }
        return null;
    }

    private final List<Vasistas> getHackedElevationVasistas(long j5, DateTime dateTime, DateTime dateTime2) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Vasistas.Category category : getCategoriesRelatedTo(Vasistas.Category.ELEVATION)) {
            x.n(SqlVasistasDao.getVasistasForCategory$default(this.sqlVasistasDao, category, j5, dateTime, dateTime2, null, 16, null), arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            DateTime startDate = ((Vasistas) next2).getStartDate();
            Object obj = linkedHashMap.get(startDate);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(startDate, obj);
            }
            ((List) obj).add(next2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Iterator it2 = ((List) entry.getValue()).iterator();
            Vasistas vasistas = null;
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                if (it2.hasNext()) {
                    float ascent = ((Vasistas) next).getAscent();
                    do {
                        Object next3 = it2.next();
                        float ascent2 = ((Vasistas) next3).getAscent();
                        if (Float.compare(ascent, ascent2) < 0) {
                            next = next3;
                            ascent = ascent2;
                        }
                    } while (it2.hasNext());
                }
            }
            Vasistas vasistas2 = (Vasistas) next;
            if (vasistas2 != null && vasistas2.getAscent() > 0.0f) {
                vasistas = vasistas2;
            }
            if (vasistas != null) {
                arrayList2.add(vasistas);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Vasistas> getSqlVasistas(Vasistas.Category category, long j5, DateTime dateTime, DateTime dateTime2) {
        if (WhenMappings.$EnumSwitchMapping$0[category.ordinal()] == 1) {
            return getHackedElevationVasistas(j5, dateTime, dateTime2);
        }
        return SqlVasistasDao.getVasistasForCategory$default(this.sqlVasistasDao, category, j5, dateTime, dateTime2, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Vasistas map(com.withings.vasistas.v2.model.Vasistas vasistas) {
        if (vasistas instanceof AhiVasistas) {
            return new AhiVasistasMapper().toVasistas((AhiVasistas) vasistas);
        }
        if (vasistas instanceof BedVasistas) {
            return new BedVasistasMapper().toVasistas((BedVasistas) vasistas);
        }
        if (vasistas instanceof BodyVasistas) {
            return new BodyVasistasMapper().toVasistas((BodyVasistas) vasistas);
        }
        if (vasistas instanceof ElevationVasistas) {
            return new ElevationVasistasMapper().toVasistas((ElevationVasistas) vasistas);
        }
        if (vasistas instanceof MotionVasistas) {
            return new MotionVasistasMapper().toVasistas((MotionVasistas) vasistas);
        }
        if (vasistas instanceof PauseVasistas) {
            return new PauseVasistasMapper().toVasistas((PauseVasistas) vasistas);
        }
        if (vasistas instanceof Spo2Vasistas) {
            return new Spo2VasistasMapper().toVasistas((Spo2Vasistas) vasistas);
        }
        if (vasistas instanceof SwimVasistas) {
            return new SwimVasistasMapper().toVasistas((SwimVasistas) vasistas);
        }
        if (vasistas instanceof TrackerSleepVasistas) {
            return new TrackerSleepVasistasMapper().toVasistas((TrackerSleepVasistas) vasistas);
        }
        if (vasistas instanceof CoreTemperatureVasistas) {
            return new CoreTemperatureVasistasMapper().toVasistas((CoreTemperatureVasistas) vasistas);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.withings.vasistas.v2.repository.VasistasRepository
    public <T extends com.withings.vasistas.v2.model.Vasistas> Object add(List<? extends T> list, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new SqlVasistasRepository$add$2(this, list, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }

    @Override // com.withings.vasistas.v2.repository.VasistasRepository
    public <T extends com.withings.vasistas.v2.model.Vasistas> Flow<List<T>> get(Class<T> vasistasClass, long j5, DateTime dateTime, DateTime dateTime2) {
        u.j(vasistasClass, "vasistasClass");
        Vasistas.Category categoryFor = getCategoryFor(vasistasClass);
        if (categoryFor == null) {
            return FlowKt.flow(new SqlVasistasRepository$get$category$1(null));
        }
        return FlowKt.callbackFlow(new SqlVasistasRepository$get$1(this, dateTime, dateTime2, j5, categoryFor, vasistasClass, null));
    }

    @Override // com.withings.vasistas.v2.repository.VasistasRepository
    public <T extends com.withings.vasistas.v2.model.Vasistas> com.withings.vasistas.v2.model.Vasistas getLastVasistas(Class<T> vasistasClass, long j5) {
        Vasistas lastVasistas;
        u.j(vasistasClass, "vasistasClass");
        Vasistas.Category categoryFor = getCategoryFor(vasistasClass);
        if (categoryFor == null || (lastVasistas = this.sqlVasistasDao.getLastVasistas(categoryFor, j5)) == null) {
            return null;
        }
        return map(vasistasClass, lastVasistas);
    }

    @Override // com.withings.vasistas.v2.repository.VasistasRepository
    public Object synchronize(d<? super y> dVar) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends com.withings.vasistas.v2.model.Vasistas> T map(Class<T> cls, Vasistas vasistas) {
        if (u.e(cls, AhiVasistas.class)) {
            return new AhiVasistasMapper().fromVasistas(vasistas);
        }
        if (u.e(cls, BedVasistas.class)) {
            return new BedVasistasMapper().fromVasistas(vasistas);
        }
        if (u.e(cls, BodyVasistas.class)) {
            return new BodyVasistasMapper().fromVasistas(vasistas);
        }
        if (u.e(cls, ElevationVasistas.class)) {
            return new ElevationVasistasMapper().fromVasistas(vasistas);
        }
        if (u.e(cls, MotionVasistas.class)) {
            return new MotionVasistasMapper().fromVasistas(vasistas);
        }
        if (u.e(cls, PauseVasistas.class)) {
            return new PauseVasistasMapper().fromVasistas(vasistas);
        }
        if (u.e(cls, Spo2Vasistas.class)) {
            return new Spo2VasistasMapper().fromVasistas(vasistas);
        }
        if (u.e(cls, SwimVasistas.class)) {
            return new SwimVasistasMapper().fromVasistas(vasistas);
        }
        if (u.e(cls, TrackerSleepVasistas.class)) {
            return new TrackerSleepVasistasMapper().fromVasistas(vasistas);
        }
        if (u.e(cls, CoreTemperatureVasistas.class)) {
            return new CoreTemperatureVasistasMapper().fromVasistas(vasistas);
        }
        return null;
    }
}
