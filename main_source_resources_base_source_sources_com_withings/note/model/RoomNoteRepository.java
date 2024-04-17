package com.withings.note.model;

import android.content.Context;
import android.util.Pair;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
/* compiled from: RoomNoteRepository.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 @2\u00020\u0001:\u0001@B\u000f\u0012\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b>\u0010?J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u001a\u001a\u00020\u00062\u0018\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010\bJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010\bJ'\u0010'\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010!J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\u0017H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\u0017H\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u0010\bJ\u0017\u00101\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u0010\bJ'\u00102\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b2\u0010(J\u001f\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00172\u0006\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b4\u0010!J\u001f\u00106\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00172\u0006\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u0010!J%\u00107\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00170\u00122\u0006\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u0014J%\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00170\u00122\u0006\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u0010\u0014J\u000f\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/withings/note/model/RoomNoteRepository;", "Lcom/withings/note/model/NoteRepository;", "Lcom/withings/note/model/NoteGroup;", "noteGroup", "attachNotesToGroup", "(Lcom/withings/note/model/NoteGroup;)Lcom/withings/note/model/NoteGroup;", "Lnm0/y;", "insertOrUpdateNotes", "(Lcom/withings/note/model/NoteGroup;)V", "Lcom/withings/note/model/Note;", ConstantsWs.REDOX_DATA_MODEL_NOTE, "Lcom/withings/note/model/NoteEntity;", "getNoteEntityFromType", "(Lcom/withings/note/model/Note;)Lcom/withings/note/model/NoteEntity;", "", "signalId", "getRemoteNoteGroupForId", "(J)Lcom/withings/note/model/NoteGroup;", "Landroidx/lifecycle/LiveData;", "getRemoteNoteGroupLiveDataForId", "(J)Landroidx/lifecycle/LiveData;", "getLocalNoteGroupForId", "getLocalNoteGroupLiveDataForId", "", "Landroid/util/Pair;", "wsAndLocaIds", "updateNotesForMeasureGroups", "(Ljava/util/List;)V", NavigationArguments.USER_ID, "getLastUpdate", "(J)J", DiscoverItems.Item.UPDATE_ACTION, "getNotSyncedNoteGroupsForUser", "(J)Ljava/util/List;", "insertOrUpdateNoteGroup", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "insertOrUpdateNoteGroupAndSync", "(Landroid/content/Context;Lcom/withings/user/User;Lcom/withings/note/model/NoteGroup;)V", "getSignalsNoteGroups", "getDeletedNotes", "()Ljava/util/List;", "getAllNotes", "deleteNote", "(Lcom/withings/note/model/Note;)V", "softDeleteNote", "deleteNoteGroup", "softDeleteNoteGroup", "deleteNoteGroupAndSync", "wsId", "getNoteGroupForMeasureGroupWsId", "id", "getNoteGroupForMeasureGroupDbId", "getNoteGroupLiveDataForMeasureGroupWsId", "getNoteGroupLiveDataForMeasureGroupDbId", CervicalMucusRecord.Appearance.CLEAR, "()V", "Lcom/withings/note/model/NoteGroupDao;", "noteGroupDao", "Lcom/withings/note/model/NoteGroupDao;", "<init>", "(Lcom/withings/note/model/NoteGroupDao;)V", "Companion", "note_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RoomNoteRepository implements NoteRepository {
    public static final Companion Companion = new Companion(null);
    public static final int NOTE_TYPE_SIGNAL = 4;
    private final NoteGroupDao noteGroupDao;

    /* compiled from: RoomNoteRepository.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/note/model/RoomNoteRepository$Companion;", "", "()V", "NOTE_TYPE_SIGNAL", "", "note_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public RoomNoteRepository(NoteGroupDao noteGroupDao) {
        u.j(noteGroupDao, "noteGroupDao");
        this.noteGroupDao = noteGroupDao;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NoteGroup attachNotesToGroup(NoteGroup noteGroup) {
        ArrayList arrayList = new ArrayList();
        for (NoteEntity noteEntity : this.noteGroupDao.getNotDeletedNotesFromNoteGroupId(noteGroup.getNoteGroupId())) {
            Note note = NoteKt.toNote(noteEntity);
            if (note != null) {
                arrayList.add(note);
            }
        }
        NoteGroupKt.addNotes(noteGroup, arrayList);
        return noteGroup;
    }

    private final NoteEntity getNoteEntityFromType(Note note) {
        if (note instanceof NoteHealthAttribute) {
            return new NoteEntity((NoteHealthAttribute) note);
        }
        if (note instanceof NoteText) {
            return new NoteEntity((NoteText) note);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void insertOrUpdateNotes(NoteGroup noteGroup) {
        List<Note> allNotes = NoteGroupKt.getAllNotes(noteGroup);
        ArrayList<NoteEntity> arrayList = new ArrayList(x.y(allNotes, 10));
        for (Note note : allNotes) {
            arrayList.add(getNoteEntityFromType(note));
        }
        for (NoteEntity noteEntity : arrayList) {
            noteEntity.setLocalNoteGroupId(Long.valueOf(noteGroup.getNoteGroupId()));
            noteEntity.setNoteGroupId(noteGroup.getWsId());
            noteEntity.setSignalId(noteGroup.getSignalId());
            this.noteGroupDao.insertOrUpdate(noteEntity);
        }
    }

    @Override // com.withings.note.model.NoteRepository
    public void clear() {
        this.noteGroupDao.deleteAllNotes();
        this.noteGroupDao.deleteAll();
    }

    @Override // com.withings.note.model.NoteRepository
    public void deleteNote(Note note) {
        u.j(note, "note");
        this.noteGroupDao.deleteNote(note.getLocalId());
    }

    @Override // com.withings.note.model.NoteRepository
    public void deleteNoteGroup(NoteGroup noteGroup) {
        u.j(noteGroup, "noteGroup");
        this.noteGroupDao.deleteAllNotesForNotegroupId(noteGroup.getNoteGroupId());
        this.noteGroupDao.deleteNoteGroup(noteGroup);
    }

    @Override // com.withings.note.model.NoteRepository
    public void deleteNoteGroupAndSync(Context context, User user, NoteGroup noteGroup) {
        u.j(context, "context");
        u.j(user, "user");
        u.j(noteGroup, "noteGroup");
        deleteNoteGroup(noteGroup);
    }

    @Override // com.withings.note.model.NoteRepository
    public List<Note> getAllNotes() {
        ArrayList arrayList = new ArrayList();
        for (NoteEntity noteEntity : this.noteGroupDao.getAllNotes()) {
            Note note = NoteKt.toNote(noteEntity);
            if (note != null) {
                arrayList.add(note);
            }
        }
        return arrayList;
    }

    @Override // com.withings.note.model.NoteRepository
    public List<Note> getDeletedNotes() {
        ArrayList arrayList = new ArrayList();
        for (NoteEntity noteEntity : this.noteGroupDao.getAllDeletedNotes()) {
            Note note = NoteKt.toNote(noteEntity);
            if (note != null) {
                arrayList.add(note);
            }
        }
        return arrayList;
    }

    @Override // com.withings.note.model.NoteRepository
    public long getLastUpdate(long j5) {
        return this.noteGroupDao.getLastUpdate(j5);
    }

    @Override // com.withings.note.model.NoteRepository
    public NoteGroup getLocalNoteGroupForId(long j5) {
        NoteGroup localBySignalId = this.noteGroupDao.getLocalBySignalId(j5);
        if (localBySignalId != null) {
            return attachNotesToGroup(localBySignalId);
        }
        return null;
    }

    @Override // com.withings.note.model.NoteRepository
    public LiveData<NoteGroup> getLocalNoteGroupLiveDataForId(long j5) {
        return e1.c(this.noteGroupDao.getLocalLiveDataBySignalId(j5), new RoomNoteRepository$getLocalNoteGroupLiveDataForId$1(this));
    }

    @Override // com.withings.note.model.NoteRepository
    public List<NoteGroup> getNotSyncedNoteGroupsForUser(long j5) {
        List<NoteGroup> notSyncedGroupsForUser = this.noteGroupDao.getNotSyncedGroupsForUser(j5);
        ArrayList arrayList = new ArrayList(x.y(notSyncedGroupsForUser, 10));
        for (NoteGroup noteGroup : notSyncedGroupsForUser) {
            arrayList.add(attachNotesToGroup(noteGroup));
        }
        return arrayList;
    }

    @Override // com.withings.note.model.NoteRepository
    public List<NoteGroup> getNoteGroupForMeasureGroupDbId(long j5) {
        List<NoteGroup> noteGroupForMeasureGroupDbId = this.noteGroupDao.getNoteGroupForMeasureGroupDbId(j5);
        if (noteGroupForMeasureGroupDbId != null) {
            List<NoteGroup> list = noteGroupForMeasureGroupDbId;
            ArrayList arrayList = new ArrayList(x.y(list, 10));
            for (NoteGroup noteGroup : list) {
                arrayList.add(attachNotesToGroup(noteGroup));
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.withings.note.model.NoteRepository
    public List<NoteGroup> getNoteGroupForMeasureGroupWsId(long j5) {
        List<NoteGroup> noteGroupForMeasureGroupWsId = this.noteGroupDao.getNoteGroupForMeasureGroupWsId(j5);
        if (noteGroupForMeasureGroupWsId != null) {
            List<NoteGroup> list = noteGroupForMeasureGroupWsId;
            ArrayList arrayList = new ArrayList(x.y(list, 10));
            for (NoteGroup noteGroup : list) {
                arrayList.add(attachNotesToGroup(noteGroup));
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.withings.note.model.NoteRepository
    public LiveData<List<NoteGroup>> getNoteGroupLiveDataForMeasureGroupDbId(long j5) {
        return e1.c(this.noteGroupDao.getNoteGroupLiveDataForMeasureGroupDbId(j5), new RoomNoteRepository$getNoteGroupLiveDataForMeasureGroupDbId$1(this));
    }

    @Override // com.withings.note.model.NoteRepository
    public LiveData<List<NoteGroup>> getNoteGroupLiveDataForMeasureGroupWsId(long j5) {
        return e1.c(this.noteGroupDao.getNoteGroupLiveDataForMeasureGroupWsId(j5), new RoomNoteRepository$getNoteGroupLiveDataForMeasureGroupWsId$1(this));
    }

    @Override // com.withings.note.model.NoteRepository
    public NoteGroup getRemoteNoteGroupForId(long j5) {
        NoteGroup remoteBySignalId = this.noteGroupDao.getRemoteBySignalId(j5);
        if (remoteBySignalId != null) {
            return attachNotesToGroup(remoteBySignalId);
        }
        return null;
    }

    @Override // com.withings.note.model.NoteRepository
    public LiveData<NoteGroup> getRemoteNoteGroupLiveDataForId(long j5) {
        return e1.c(this.noteGroupDao.getRemoteLiveDataBySignalId(j5), new RoomNoteRepository$getRemoteNoteGroupLiveDataForId$1(this));
    }

    @Override // com.withings.note.model.NoteRepository
    public List<NoteGroup> getSignalsNoteGroups(long j5) {
        List<NoteGroup> notDeletedGroupsForUserAndType = this.noteGroupDao.getNotDeletedGroupsForUserAndType(j5, 4);
        ArrayList arrayList = new ArrayList(x.y(notDeletedGroupsForUserAndType, 10));
        for (NoteGroup noteGroup : notDeletedGroupsForUserAndType) {
            arrayList.add(attachNotesToGroup(noteGroup));
        }
        return arrayList;
    }

    @Override // com.withings.note.model.NoteRepository
    public void insertOrUpdateNoteGroup(NoteGroup noteGroup) {
        NoteGroup remoteNoteGroupForId;
        u.j(noteGroup, "noteGroup");
        Long signalId = noteGroup.getSignalId();
        if (signalId != null && (remoteNoteGroupForId = getRemoteNoteGroupForId(signalId.longValue())) != null) {
            noteGroup.setNoteGroupId(remoteNoteGroupForId.getNoteGroupId());
            noteGroup.setLocalHeartSignalMeasurementId(remoteNoteGroupForId.getLocalHeartSignalMeasurementId());
            noteGroup.setRemoteMeasureGroupId(remoteNoteGroupForId.getRemoteMeasureGroupId());
            for (NoteText noteText : remoteNoteGroupForId.getTexts()) {
                deleteNote(noteText);
            }
        }
        noteGroup.setNoteGroupId(this.noteGroupDao.insertOrUpdate(noteGroup));
        insertOrUpdateNotes(noteGroup);
    }

    @Override // com.withings.note.model.NoteRepository
    public void insertOrUpdateNoteGroupAndSync(Context context, User user, NoteGroup noteGroup) {
        u.j(context, "context");
        u.j(user, "user");
        u.j(noteGroup, "noteGroup");
        insertOrUpdateNoteGroup(noteGroup);
    }

    @Override // com.withings.note.model.NoteRepository
    public void softDeleteNote(Note note) {
        u.j(note, "note");
        note.setDeleted(true);
        if (note instanceof NoteHealthAttribute) {
            this.noteGroupDao.update(new NoteEntity((NoteHealthAttribute) note));
        } else if (note instanceof NoteText) {
            this.noteGroupDao.update(new NoteEntity((NoteText) note));
        }
    }

    @Override // com.withings.note.model.NoteRepository
    public void softDeleteNoteGroup(NoteGroup noteGroup) {
        u.j(noteGroup, "noteGroup");
        noteGroup.setDeleted(true);
        noteGroup.setSynced(false);
        update(noteGroup);
    }

    @Override // com.withings.note.model.NoteRepository
    public void update(NoteGroup noteGroup) {
        u.j(noteGroup, "noteGroup");
        List<Note> allNotes = NoteGroupKt.getAllNotes(noteGroup);
        ArrayList<NoteEntity> arrayList = new ArrayList(x.y(allNotes, 10));
        for (Note note : allNotes) {
            arrayList.add(getNoteEntityFromType(note));
        }
        for (NoteEntity noteEntity : arrayList) {
            this.noteGroupDao.insertOrUpdate(noteEntity);
        }
        this.noteGroupDao.update(noteGroup);
    }

    @Override // com.withings.note.model.NoteRepository
    public void updateNotesForMeasureGroups(List<? extends Pair<Long, Long>> wsAndLocaIds) {
        u.j(wsAndLocaIds, "wsAndLocaIds");
        Iterator<T> it = wsAndLocaIds.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            NoteGroupDao noteGroupDao = this.noteGroupDao;
            Object first = pair.first;
            u.i(first, "first");
            long longValue = ((Number) first).longValue();
            Object second = pair.second;
            u.i(second, "second");
            noteGroupDao.updateNoteGroupsWithMeasureIds(longValue, ((Number) second).longValue());
        }
    }
}
