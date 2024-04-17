package com.withings.library.vo2.firstbeat;

import com.withings.library.vo2.Vo2MaxInput;
import com.withings.library.vo2.Vo2MaxOutput;
import com.withings.library.vo2.Vo2MaxTrace;
import com.withings.library.vo2.Vo2MaxUserInfoInput;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlinx.datetime.Clock$System;
/* compiled from: FirstbeatVo2MaxTracesBuilder.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\f\u0010\u0011\u001a\u00020\u0005*\u00020\u0012H\u0002¨\u0006\u0013"}, d2 = {"Lcom/withings/library/vo2/firstbeat/FirstbeatVo2MaxTracesBuilder;", "", "()V", "build", "", "Lcom/withings/library/vo2/Vo2MaxTrace;", "vo2MaxUserInfoInput", "Lcom/withings/library/vo2/Vo2MaxUserInfoInput;", "vo2MaxInputs", "Lcom/withings/library/vo2/Vo2MaxInput;", "vo2MaxOutput", "Lcom/withings/library/vo2/Vo2MaxOutput;", "eteResults", "Lcom/withings/library/vo2/firstbeat/EteResults;", "buildDataInputTraces", "buildDataOutputTraces", "buildUserInfoTraces", "toTrace", "", "Vo2Lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FirstbeatVo2MaxTracesBuilder {
    private final List<Vo2MaxTrace> buildDataInputTraces(List<Vo2MaxInput> list) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("FirstBeat input datas : ");
        for (Vo2MaxInput vo2MaxInput : list) {
            arrayList.add("     Heart rate : " + vo2MaxInput.getHeartRate());
            arrayList.add("     Speed : " + vo2MaxInput.getSpeed());
            arrayList.add("     Altitude : " + vo2MaxInput.getAltitude());
        }
        ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
        for (String str : arrayList) {
            arrayList2.add(toTrace(str));
        }
        return arrayList2;
    }

    private final List<Vo2MaxTrace> buildDataOutputTraces(Vo2MaxOutput vo2MaxOutput, EteResults eteResults) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("FirstBeat output datas : ");
        arrayList.add("     Corrected HR : " + eteResults.getCorrectedHr());
        arrayList.add("     VO2max : " + vo2MaxOutput.getVo2Max());
        arrayList.add("     Computed training load : " + vo2MaxOutput.getTrainingLoad());
        arrayList.add("     Max MET minutes : " + eteResults.getMaximalMetMinutes());
        arrayList.add("     Artifact percent : " + eteResults.getArtifactPercent());
        arrayList.add("     Minimal HR : " + eteResults.getMinimalHr());
        arrayList.add("     Maximal HR : " + eteResults.getMaximalHr());
        arrayList.add("     Training load peak : " + eteResults.getTrainingLoadPeak());
        arrayList.add("     Maximal met : " + eteResults.getMaximalMet());
        ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
        for (String str : arrayList) {
            arrayList2.add(toTrace(str));
        }
        return arrayList2;
    }

    private final List<Vo2MaxTrace> buildUserInfoTraces(Vo2MaxUserInfoInput vo2MaxUserInfoInput) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("User info : ");
        arrayList.add("     Age : " + vo2MaxUserInfoInput.getAge());
        arrayList.add("     Height : " + vo2MaxUserInfoInput.getHeight());
        arrayList.add("     Weight : " + vo2MaxUserInfoInput.getWeight());
        arrayList.add("     Gender : " + vo2MaxUserInfoInput.getGender());
        arrayList.add("     Max heart rate : " + vo2MaxUserInfoInput.getMaxHeartRate());
        arrayList.add("     Max met : " + vo2MaxUserInfoInput.getMaxMet());
        arrayList.add("     Activity class : " + vo2MaxUserInfoInput.getActivityClass());
        arrayList.add("     Monthly load : " + vo2MaxUserInfoInput.getMonthlyLoad());
        arrayList.add("     Latest VO2MAX : " + vo2MaxUserInfoInput.getLatestVo2Max());
        ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
        for (String str : arrayList) {
            arrayList2.add(toTrace(str));
        }
        return arrayList2;
    }

    private final Vo2MaxTrace toTrace(String str) {
        return new Vo2MaxTrace(Clock$System.INSTANCE.now().getEpochSeconds(), "VO2Max", str);
    }

    public final List<Vo2MaxTrace> build(Vo2MaxUserInfoInput vo2MaxUserInfoInput, List<Vo2MaxInput> vo2MaxInputs, Vo2MaxOutput vo2MaxOutput, EteResults eteResults) {
        u.j(vo2MaxUserInfoInput, "vo2MaxUserInfoInput");
        u.j(vo2MaxInputs, "vo2MaxInputs");
        u.j(vo2MaxOutput, "vo2MaxOutput");
        u.j(eteResults, "eteResults");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(buildUserInfoTraces(vo2MaxUserInfoInput));
        arrayList.addAll(buildDataInputTraces(vo2MaxInputs));
        arrayList.addAll(buildDataOutputTraces(vo2MaxOutput, eteResults));
        return arrayList;
    }
}
