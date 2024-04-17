package com.withings.vasistas.model;

import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import sm0.a;
import x70.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SleepLevel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lcom/withings/vasistas/model/SleepLevel;", "", "vasistasType", "", "barHeight", "colorRes", "stringResID", "(Ljava/lang/String;IIIII)V", "getColorRes", "()I", "getStringResID", "getVasistasType", "getBarHeight", "hasRem", "", "Awake", "Rem", "Light", "Deep", "Manual", "Unspecified", "Companion", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SleepLevel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SleepLevel[] $VALUES;
    public static final SleepLevel Awake = new SleepLevel("Awake", 0, 0, 4, C1987R.color.datavizMonochromaticGhost4, C1987R.string._AWAKE_);
    public static final Companion Companion;
    public static final SleepLevel Deep;
    public static final SleepLevel Light;
    public static final SleepLevel Manual;
    public static final SleepLevel Rem;
    private static final List<Integer> SleepingStages;
    public static final SleepLevel Unspecified;
    private final int barHeight;
    private final int colorRes;
    private final int stringResID;
    private final int vasistasType;

    /* compiled from: SleepLevel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/withings/vasistas/model/SleepLevel$Companion;", "", "()V", "SleepingStages", "", "", "getSleepingStages", "()Ljava/util/List;", "fromVasistasType", "Lcom/withings/vasistas/model/SleepLevel;", "wsInt", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final SleepLevel fromVasistasType(int i11) {
            Object obj;
            Iterator<E> it = SleepLevel.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((SleepLevel) obj).getVasistasType() == i11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            SleepLevel sleepLevel = (SleepLevel) obj;
            if (sleepLevel == null) {
                b.t(SleepLevel.class.getName(), android.support.v4.media.a.a("Incorrect sleep level : ", i11), new Object[0]);
                return SleepLevel.Awake;
            }
            return sleepLevel;
        }

        public final List<Integer> getSleepingStages() {
            return SleepLevel.SleepingStages;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ SleepLevel[] $values() {
        return new SleepLevel[]{Awake, Rem, Light, Deep, Manual, Unspecified};
    }

    static {
        SleepLevel sleepLevel = new SleepLevel("Rem", 1, 3, 3, C1987R.color.datavizMonochromaticNeutral1, C1987R.string._REM_);
        Rem = sleepLevel;
        SleepLevel sleepLevel2 = new SleepLevel("Light", 2, 1, 2, C1987R.color.datavizMonochromaticNeutral3, C1987R.string._LIGHT_);
        Light = sleepLevel2;
        SleepLevel sleepLevel3 = new SleepLevel("Deep", 3, 2, 1, C1987R.color.datavizMonochromaticNeutral5, C1987R.string._DEEP_);
        Deep = sleepLevel3;
        SleepLevel sleepLevel4 = new SleepLevel("Manual", 4, 4, 1, C1987R.color.statusBad, C1987R.string._MANUAL_);
        Manual = sleepLevel4;
        Unspecified = new SleepLevel("Unspecified", 5, 5, 2, C1987R.color.datavizMonochromaticNeutral2, C1987R.string._SLEEP_);
        SleepLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = sm0.b.a($values);
        Companion = new Companion(null);
        List<SleepLevel> W = x.W(sleepLevel, sleepLevel2, sleepLevel3, sleepLevel4);
        ArrayList arrayList = new ArrayList(x.y(W, 10));
        for (SleepLevel sleepLevel5 : W) {
            arrayList.add(Integer.valueOf(sleepLevel5.vasistasType));
        }
        SleepingStages = arrayList;
    }

    private SleepLevel(String str, int i11, int i12, int i13, int i14, int i15) {
        this.vasistasType = i12;
        this.barHeight = i13;
        this.colorRes = i14;
        this.stringResID = i15;
    }

    public static final SleepLevel fromVasistasType(int i11) {
        return Companion.fromVasistasType(i11);
    }

    public static a<SleepLevel> getEntries() {
        return $ENTRIES;
    }

    public static SleepLevel valueOf(String str) {
        return (SleepLevel) Enum.valueOf(SleepLevel.class, str);
    }

    public static SleepLevel[] values() {
        return (SleepLevel[]) $VALUES.clone();
    }

    public int getBarHeight(boolean z5) {
        return this.barHeight;
    }

    public final int getColorRes() {
        return this.colorRes;
    }

    public final int getStringResID() {
        return this.stringResID;
    }

    public final int getVasistasType() {
        return this.vasistasType;
    }
}
