package com.withings.manualLogging.data.webservice.note;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.wiscale2.spo2.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.k;
import nm0.l;
import org.joda.time.DateTime;
/* compiled from: NoteApi.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"getWebserviceNoteGroups", "", "Lcom/withings/manualLogging/data/webservice/note/WebServiceNoteGroup;", "Lcom/withings/manualLogging/data/webservice/note/NoteApi;", NavigationArguments.USER_ID, "", "lastUpdate", "Lorg/joda/time/DateTime;", "manual-logging-data_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NoteApiKt {
    public static final List<WebServiceNoteGroup> getWebserviceNoteGroups(NoteApi noteApi, long j5, DateTime lastUpdate) {
        GetNoteGroupResponse getNoteGroupResponse;
        int i11;
        u.j(noteApi, "<this>");
        u.j(lastUpdate, "lastUpdate");
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        do {
            try {
                Long valueOf = Long.valueOf(m.g(lastUpdate));
                GetNoteGroupResponse getNoteGroupResponse2 = (GetNoteGroupResponse) obj;
                if (getNoteGroupResponse2 != null) {
                    i11 = getNoteGroupResponse2.getOffset();
                } else {
                    i11 = 0;
                }
                obj = noteApi.getNoteGroups(j5, valueOf, i11);
            } catch (Throwable th2) {
                obj = l.a(th2);
            }
            if (obj instanceof k.a) {
                obj = null;
            }
            getNoteGroupResponse = (GetNoteGroupResponse) obj;
            if (getNoteGroupResponse != null) {
                arrayList.addAll(getNoteGroupResponse.getNoteGroups());
            }
            if (getNoteGroupResponse == null) {
                break;
            }
        } while (getNoteGroupResponse.getHasMore());
        return arrayList;
    }
}
