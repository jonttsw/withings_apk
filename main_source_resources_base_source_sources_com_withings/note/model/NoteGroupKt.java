package com.withings.note.model;

import com.withings.common.device.s;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import ky.d;
import nm0.y;
import org.joda.time.DateTime;
import pm0.a;
/* compiled from: NoteGroup.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u0019\u0010\u0014\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\r\u001a\u001f\u0010\u0018\u001a\u00020\u000b*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001a\u001a\u00020\u000b*\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001c\u001a\u00020\u000b*\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001b\u001a!\u0010\u001f\u001a\u00020\u000b*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b\u001f\u0010\u0019\u001a\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u0001¢\u0006\u0004\b \u0010\u0011\u001a\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u0001¢\u0006\u0004\b!\u0010\u0011\u001a+\u0010%\u001a\u00020$\"\b\b\u0000\u0010\"*\u00020\u000f*\u00028\u00002\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010(\u001a\u00020\u000b*\u00020\u00012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e¢\u0006\u0004\b(\u0010\u0019\u001a\u001f\u0010)\u001a\u00020\u000b*\u00020\u00012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e¢\u0006\u0004\b)\u0010\u0019\u001a7\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\b\b\u0000\u0010\"*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b*\u0010+\u001a\u001b\u0010-\u001a\u00020$*\u00020\u00012\b\u0010,\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b-\u0010.\u001a\u0011\u0010/\u001a\u00020$*\u00020\u0001¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"Lky/d;", "Lcom/withings/note/model/NoteGroup;", "createNoteGroup", "(Lky/d;)Lcom/withings/note/model/NoteGroup;", "", "getOrGenerateCryptpart", "(Lcom/withings/note/model/NoteGroup;)Ljava/lang/String;", "Lcom/withings/note/model/NoteText;", "getNoteText", "(Lcom/withings/note/model/NoteGroup;)Lcom/withings/note/model/NoteText;", "content", "Lnm0/y;", "setNoteText", "(Lcom/withings/note/model/NoteGroup;Ljava/lang/String;)V", "", "Lcom/withings/note/model/Note;", "getNotDeletedSymptoms", "(Lcom/withings/note/model/NoteGroup;)Ljava/util/List;", "getNotDeletedMedicines", ConstantsWs.REDOX_DATA_MODEL_NOTE, "addNote", "(Lcom/withings/note/model/NoteGroup;Lcom/withings/note/model/Note;)V", "addNoteText", "notes", "addNotes", "(Lcom/withings/note/model/NoteGroup;Ljava/util/List;)V", "removeSymptoms", "(Lcom/withings/note/model/NoteGroup;)V", "removeMedicines", "", "Lcom/withings/note/model/NoteHealthAttribute;", "removeHealthAttributes", "getAllNotes", "getAllNotDeletedNotes", "T", "inNotes", "", "noteContainsNotes", "(Lcom/withings/note/model/Note;Ljava/util/List;)Z", "newNotes", "updateWithMedicineNotes", "updateWithSymptomNotes", "getUpdatedNotes", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "otherNoteGroup", "equalsContent", "(Lcom/withings/note/model/NoteGroup;Lcom/withings/note/model/NoteGroup;)Z", "hasBeenUpdated", "(Lcom/withings/note/model/NoteGroup;)Z", "note_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NoteGroupKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void addNote(NoteGroup noteGroup, Note note) {
        u.j(noteGroup, "<this>");
        u.j(note, "note");
        note.setNoteGroupId(noteGroup.getWsId());
        note.setLocalNoteGroupId(Long.valueOf(noteGroup.getNoteGroupId()));
        if (note instanceof NoteText) {
            noteGroup.getTexts().add(note);
        } else if (note instanceof NoteHealthAttribute) {
            int type = ((NoteHealthAttribute) note).getType();
            if (type != 1) {
                if (type == 2) {
                    noteGroup.getSymptoms().add(note);
                    return;
                }
                return;
            }
            noteGroup.getMedicines().add(note);
        }
    }

    public static final void addNoteText(NoteGroup noteGroup, String content) {
        y yVar;
        u.j(noteGroup, "<this>");
        u.j(content, "content");
        NoteText noteText = (NoteText) x.K(noteGroup.getTexts());
        if (noteText != null) {
            noteText.setText(content);
            noteText.setModified(DateTime.now().getMillis());
            yVar = y.f85009a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            addNote(noteGroup, new NoteText(0L, null, 0, content, null, null, false, DateTime.now().getMillis(), 119, null));
        }
        noteGroup.setSynced(false);
        noteGroup.setLocalModifiedDate(DateTime.now());
    }

    public static final void addNotes(NoteGroup noteGroup, List<? extends Note> notes) {
        u.j(noteGroup, "<this>");
        u.j(notes, "notes");
        for (Note note : notes) {
            addNote(noteGroup, note);
        }
    }

    public static final NoteGroup createNoteGroup(d dVar) {
        u.j(dVar, "<this>");
        return new NoteGroup(0L, null, Long.valueOf(dVar.h()), dVar.i(), Long.valueOf(dVar.d()), null, null, null, null, null, null, false, null, false, false, 32739, null);
    }

    public static final boolean equalsContent(NoteGroup noteGroup, NoteGroup noteGroup2) {
        String str;
        u.j(noteGroup, "<this>");
        if (noteGroup2 == null || getAllNotDeletedNotes(noteGroup).size() != getAllNotDeletedNotes(noteGroup2).size()) {
            return false;
        }
        NoteText noteText = getNoteText(noteGroup);
        String str2 = null;
        if (noteText != null) {
            str = noteText.getText();
        } else {
            str = null;
        }
        NoteText noteText2 = getNoteText(noteGroup2);
        if (noteText2 != null) {
            str2 = noteText2.getText();
        }
        return u.e(str, str2);
    }

    public static final List<Note> getAllNotDeletedNotes(NoteGroup noteGroup) {
        u.j(noteGroup, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getNotDeletedSymptoms(noteGroup));
        arrayList.addAll(getNotDeletedMedicines(noteGroup));
        NoteText noteText = getNoteText(noteGroup);
        if (noteText != null) {
            arrayList.add(noteText);
        }
        return x.Q0(arrayList);
    }

    public static final List<Note> getAllNotes(NoteGroup noteGroup) {
        u.j(noteGroup, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(noteGroup.getTexts());
        arrayList.addAll(noteGroup.getSymptoms());
        arrayList.addAll(noteGroup.getMedicines());
        return x.Q0(arrayList);
    }

    public static final List<Note> getNotDeletedMedicines(NoteGroup noteGroup) {
        u.j(noteGroup, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : noteGroup.getMedicines()) {
            if (!((NoteHealthAttribute) obj).getDeleted()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List<Note> getNotDeletedSymptoms(NoteGroup noteGroup) {
        u.j(noteGroup, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : noteGroup.getSymptoms()) {
            if (!((NoteHealthAttribute) obj).getDeleted()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final NoteText getNoteText(NoteGroup noteGroup) {
        Object obj;
        u.j(noteGroup, "<this>");
        Iterator it = x.D0(noteGroup.getTexts(), new Comparator() { // from class: com.withings.note.model.NoteGroupKt$getNoteText$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return a.b(Long.valueOf(((NoteText) t12).getModified()), Long.valueOf(((NoteText) t11).getModified()));
            }
        }).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!((NoteText) obj).getDeleted()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (NoteText) obj;
    }

    public static final String getOrGenerateCryptpart(NoteGroup noteGroup) {
        u.j(noteGroup, "<this>");
        if (noteGroup.getCryptpart() == null) {
            noteGroup.setCryptpart(s.a());
        }
        String cryptpart = noteGroup.getCryptpart();
        if (cryptpart == null) {
            return "";
        }
        return cryptpart;
    }

    private static final <T extends Note> List<T> getUpdatedNotes(List<? extends T> list, List<? extends T> list2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Note note = (Note) obj;
            if (note.getWsId() != null && !noteContainsNotes(note, list2)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Note note2 = (Note) it.next();
            note2.setDeleted(true);
            arrayList2.add(note2);
        }
        ArrayList S0 = x.S0(arrayList2);
        for (T t11 : list2) {
            if (!noteContainsNotes(t11, list)) {
                S0.add(t11);
            }
        }
        return S0;
    }

    public static final boolean hasBeenUpdated(NoteGroup noteGroup) {
        DateTime localModifiedDate;
        u.j(noteGroup, "<this>");
        if (noteGroup.getServerModifiedDate() != null && ((localModifiedDate = noteGroup.getLocalModifiedDate()) == null || !localModifiedDate.isAfter(noteGroup.getServerModifiedDate()))) {
            return false;
        }
        return true;
    }

    private static final <T extends Note> boolean noteContainsNotes(T t11, List<? extends T> list) {
        List<? extends T> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            Note note = (Note) it.next();
            if (!note.getDeleted() && u.e(t11, note)) {
                return true;
            }
        }
        return false;
    }

    private static final void removeHealthAttributes(NoteGroup noteGroup, List<NoteHealthAttribute> list) {
        ArrayList arrayList = new ArrayList();
        for (NoteHealthAttribute noteHealthAttribute : list) {
            if (removeHealthAttributes$lambda$8(noteHealthAttribute)) {
                arrayList.add(noteHealthAttribute);
            }
        }
        list.removeAll(arrayList);
        for (NoteHealthAttribute noteHealthAttribute2 : list) {
            noteHealthAttribute2.setDeleted(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeHealthAttributes$lambda$8(NoteHealthAttribute noteHealthAttribute) {
        if (noteHealthAttribute.getWsId() == null) {
            return true;
        }
        return false;
    }

    public static final void removeMedicines(NoteGroup noteGroup) {
        u.j(noteGroup, "<this>");
        removeHealthAttributes(noteGroup, noteGroup.getMedicines());
    }

    public static final void removeSymptoms(NoteGroup noteGroup) {
        u.j(noteGroup, "<this>");
        removeHealthAttributes(noteGroup, noteGroup.getSymptoms());
    }

    public static final void setNoteText(NoteGroup noteGroup, String content) {
        Object obj;
        u.j(noteGroup, "<this>");
        u.j(content, "content");
        Iterator it = x.D0(noteGroup.getTexts(), new Comparator() { // from class: com.withings.note.model.NoteGroupKt$setNoteText$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return a.b(Long.valueOf(((NoteText) t12).getModified()), Long.valueOf(((NoteText) t11).getModified()));
            }
        }).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!((NoteText) obj).getDeleted()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NoteText noteText = (NoteText) obj;
        if (noteText != null) {
            noteText.setText(content);
        }
    }

    public static final void updateWithMedicineNotes(NoteGroup noteGroup, List<NoteHealthAttribute> newNotes) {
        u.j(noteGroup, "<this>");
        u.j(newNotes, "newNotes");
        noteGroup.setMedicines(getUpdatedNotes(noteGroup.getMedicines(), newNotes));
    }

    public static final void updateWithSymptomNotes(NoteGroup noteGroup, List<NoteHealthAttribute> newNotes) {
        u.j(noteGroup, "<this>");
        u.j(newNotes, "newNotes");
        noteGroup.setSymptoms(getUpdatedNotes(noteGroup.getSymptoms(), newNotes));
    }
}
