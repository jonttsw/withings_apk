package com.withings.note.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.d0;
import androidx.room.h0;
import androidx.room.j;
import androidx.room.k;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.DateTime;
import pm.b;
import x8.a;
import z8.f;
/* loaded from: classes4.dex */
public final class NoteGroupDao_RoomDb_Impl implements NoteGroupDao {
    private final b __commonRoomConverter = new b();
    private final RoomDatabase __db;
    private final j<NoteGroup> __deletionAdapterOfNoteGroupAsRoomNoteGroup;
    private final k<NoteEntity> __insertionAdapterOfNoteEntityAsRoomNote;
    private final k<NoteGroup> __insertionAdapterOfNoteGroupAsRoomNoteGroup;
    private final h0 __preparedStmtOfDeleteAll;
    private final h0 __preparedStmtOfDeleteAllNotes;
    private final h0 __preparedStmtOfDeleteAllNotesForNotegroupId;
    private final h0 __preparedStmtOfDeleteNote;
    private final h0 __preparedStmtOfUpdateNoteGroupsWithMeasureIds;
    private final h0 __preparedStmtOfUpdateSignalId;
    private final j<NoteEntity> __updateAdapterOfNoteEntityAsRoomNote;
    private final j<NoteGroup> __updateAdapterOfNoteGroupAsRoomNoteGroup;

    public NoteGroupDao_RoomDb_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfNoteGroupAsRoomNoteGroup = new k<NoteGroup>(roomDatabase) { // from class: com.withings.note.model.NoteGroupDao_RoomDb_Impl.1
            @Override // androidx.room.h0
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `NoteGroup` (`noteGroupId`,`wsId`,`userId`,`remoteMeasureGroupId`,`localMeasureGroupId`,`localEcgId`,`cryptpart`,`date`,`serverCreatedDate`,`serverModifiedDate`,`localModifiedDate`,`noSymptom`,`signalId`,`deleted`,`synced`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.k
            public void bind(f fVar, NoteGroup noteGroup) {
                fVar.v(1, noteGroup.getNoteGroupId());
                if (noteGroup.getWsId() == null) {
                    fVar.g2(2);
                } else {
                    fVar.v(2, noteGroup.getWsId().longValue());
                }
                if (noteGroup.getUserId() == null) {
                    fVar.g2(3);
                } else {
                    fVar.v(3, noteGroup.getUserId().longValue());
                }
                fVar.v(4, noteGroup.getRemoteMeasureGroupId());
                if (noteGroup.getLocalMeasureGroupId() == null) {
                    fVar.g2(5);
                } else {
                    fVar.v(5, noteGroup.getLocalMeasureGroupId().longValue());
                }
                if (noteGroup.getLocalHeartSignalMeasurementId() == null) {
                    fVar.g2(6);
                } else {
                    fVar.v(6, noteGroup.getLocalHeartSignalMeasurementId().longValue());
                }
                if (noteGroup.getCryptpart() == null) {
                    fVar.g2(7);
                } else {
                    fVar.s(7, noteGroup.getCryptpart());
                }
                b bVar = NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime date = noteGroup.getDate();
                bVar.getClass();
                Long e11 = b.e(date);
                if (e11 == null) {
                    fVar.g2(8);
                } else {
                    fVar.v(8, e11.longValue());
                }
                b bVar2 = NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime serverCreatedDate = noteGroup.getServerCreatedDate();
                bVar2.getClass();
                Long e12 = b.e(serverCreatedDate);
                if (e12 == null) {
                    fVar.g2(9);
                } else {
                    fVar.v(9, e12.longValue());
                }
                b bVar3 = NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime serverModifiedDate = noteGroup.getServerModifiedDate();
                bVar3.getClass();
                Long e13 = b.e(serverModifiedDate);
                if (e13 == null) {
                    fVar.g2(10);
                } else {
                    fVar.v(10, e13.longValue());
                }
                b bVar4 = NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime localModifiedDate = noteGroup.getLocalModifiedDate();
                bVar4.getClass();
                Long e14 = b.e(localModifiedDate);
                if (e14 == null) {
                    fVar.g2(11);
                } else {
                    fVar.v(11, e14.longValue());
                }
                fVar.v(12, noteGroup.getNoSymptom() ? 1L : 0L);
                if (noteGroup.getSignalId() == null) {
                    fVar.g2(13);
                } else {
                    fVar.v(13, noteGroup.getSignalId().longValue());
                }
                fVar.v(14, noteGroup.getDeleted() ? 1L : 0L);
                fVar.v(15, noteGroup.getSynced() ? 1L : 0L);
            }
        };
        this.__insertionAdapterOfNoteEntityAsRoomNote = new k<NoteEntity>(roomDatabase) { // from class: com.withings.note.model.NoteGroupDao_RoomDb_Impl.2
            @Override // androidx.room.h0
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `NoteEntity` (`noteId`,`noteWsId`,`noteGroupId`,`localNoteGroupId`,`noteDeleted`,`type`,`text`,`noteHealthAttributeId`,`noteHealthAttributeLocalId`,`signalId`,`modified`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.k
            public void bind(f fVar, NoteEntity noteEntity) {
                fVar.v(1, noteEntity.getNoteId());
                if (noteEntity.getNoteWsId() == null) {
                    fVar.g2(2);
                } else {
                    fVar.v(2, noteEntity.getNoteWsId().longValue());
                }
                if (noteEntity.getNoteGroupId() == null) {
                    fVar.g2(3);
                } else {
                    fVar.v(3, noteEntity.getNoteGroupId().longValue());
                }
                if (noteEntity.getLocalNoteGroupId() == null) {
                    fVar.g2(4);
                } else {
                    fVar.v(4, noteEntity.getLocalNoteGroupId().longValue());
                }
                fVar.v(5, noteEntity.getNoteDeleted() ? 1L : 0L);
                fVar.v(6, noteEntity.getType());
                if (noteEntity.getText() == null) {
                    fVar.g2(7);
                } else {
                    fVar.s(7, noteEntity.getText());
                }
                if (noteEntity.getNoteHealthAttributeId() == null) {
                    fVar.g2(8);
                } else {
                    fVar.v(8, noteEntity.getNoteHealthAttributeId().longValue());
                }
                if (noteEntity.getNoteHealthAttributeLocalId() == null) {
                    fVar.g2(9);
                } else {
                    fVar.v(9, noteEntity.getNoteHealthAttributeLocalId().longValue());
                }
                if (noteEntity.getSignalId() == null) {
                    fVar.g2(10);
                } else {
                    fVar.v(10, noteEntity.getSignalId().longValue());
                }
                fVar.v(11, noteEntity.getModified());
            }
        };
        this.__deletionAdapterOfNoteGroupAsRoomNoteGroup = new j<NoteGroup>(roomDatabase) { // from class: com.withings.note.model.NoteGroupDao_RoomDb_Impl.3
            @Override // androidx.room.j, androidx.room.h0
            protected String createQuery() {
                return "DELETE FROM `NoteGroup` WHERE `noteGroupId` = ? AND `wsId` = ? AND `userId` = ? AND `remoteMeasureGroupId` = ? AND `localMeasureGroupId` = ? AND `localEcgId` = ? AND `cryptpart` = ? AND `date` = ? AND `serverCreatedDate` = ? AND `serverModifiedDate` = ? AND `localModifiedDate` = ? AND `noSymptom` = ? AND `signalId` = ? AND `deleted` = ? AND `synced` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.j
            public void bind(f fVar, NoteGroup noteGroup) {
                fVar.v(1, noteGroup.getNoteGroupId());
                if (noteGroup.getWsId() == null) {
                    fVar.g2(2);
                } else {
                    fVar.v(2, noteGroup.getWsId().longValue());
                }
                if (noteGroup.getUserId() == null) {
                    fVar.g2(3);
                } else {
                    fVar.v(3, noteGroup.getUserId().longValue());
                }
                fVar.v(4, noteGroup.getRemoteMeasureGroupId());
                if (noteGroup.getLocalMeasureGroupId() == null) {
                    fVar.g2(5);
                } else {
                    fVar.v(5, noteGroup.getLocalMeasureGroupId().longValue());
                }
                if (noteGroup.getLocalHeartSignalMeasurementId() == null) {
                    fVar.g2(6);
                } else {
                    fVar.v(6, noteGroup.getLocalHeartSignalMeasurementId().longValue());
                }
                if (noteGroup.getCryptpart() == null) {
                    fVar.g2(7);
                } else {
                    fVar.s(7, noteGroup.getCryptpart());
                }
                b bVar = NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime date = noteGroup.getDate();
                bVar.getClass();
                Long e11 = b.e(date);
                if (e11 == null) {
                    fVar.g2(8);
                } else {
                    fVar.v(8, e11.longValue());
                }
                b bVar2 = NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime serverCreatedDate = noteGroup.getServerCreatedDate();
                bVar2.getClass();
                Long e12 = b.e(serverCreatedDate);
                if (e12 == null) {
                    fVar.g2(9);
                } else {
                    fVar.v(9, e12.longValue());
                }
                b bVar3 = NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime serverModifiedDate = noteGroup.getServerModifiedDate();
                bVar3.getClass();
                Long e13 = b.e(serverModifiedDate);
                if (e13 == null) {
                    fVar.g2(10);
                } else {
                    fVar.v(10, e13.longValue());
                }
                b bVar4 = NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime localModifiedDate = noteGroup.getLocalModifiedDate();
                bVar4.getClass();
                Long e14 = b.e(localModifiedDate);
                if (e14 == null) {
                    fVar.g2(11);
                } else {
                    fVar.v(11, e14.longValue());
                }
                fVar.v(12, noteGroup.getNoSymptom() ? 1L : 0L);
                if (noteGroup.getSignalId() == null) {
                    fVar.g2(13);
                } else {
                    fVar.v(13, noteGroup.getSignalId().longValue());
                }
                fVar.v(14, noteGroup.getDeleted() ? 1L : 0L);
                fVar.v(15, noteGroup.getSynced() ? 1L : 0L);
            }
        };
        this.__updateAdapterOfNoteGroupAsRoomNoteGroup = new j<NoteGroup>(roomDatabase) { // from class: com.withings.note.model.NoteGroupDao_RoomDb_Impl.4
            @Override // androidx.room.j, androidx.room.h0
            protected String createQuery() {
                return "UPDATE OR ABORT `NoteGroup` SET `noteGroupId` = ?,`wsId` = ?,`userId` = ?,`remoteMeasureGroupId` = ?,`localMeasureGroupId` = ?,`localEcgId` = ?,`cryptpart` = ?,`date` = ?,`serverCreatedDate` = ?,`serverModifiedDate` = ?,`localModifiedDate` = ?,`noSymptom` = ?,`signalId` = ?,`deleted` = ?,`synced` = ? WHERE `noteGroupId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.j
            public void bind(f fVar, NoteGroup noteGroup) {
                fVar.v(1, noteGroup.getNoteGroupId());
                if (noteGroup.getWsId() == null) {
                    fVar.g2(2);
                } else {
                    fVar.v(2, noteGroup.getWsId().longValue());
                }
                if (noteGroup.getUserId() == null) {
                    fVar.g2(3);
                } else {
                    fVar.v(3, noteGroup.getUserId().longValue());
                }
                fVar.v(4, noteGroup.getRemoteMeasureGroupId());
                if (noteGroup.getLocalMeasureGroupId() == null) {
                    fVar.g2(5);
                } else {
                    fVar.v(5, noteGroup.getLocalMeasureGroupId().longValue());
                }
                if (noteGroup.getLocalHeartSignalMeasurementId() == null) {
                    fVar.g2(6);
                } else {
                    fVar.v(6, noteGroup.getLocalHeartSignalMeasurementId().longValue());
                }
                if (noteGroup.getCryptpart() == null) {
                    fVar.g2(7);
                } else {
                    fVar.s(7, noteGroup.getCryptpart());
                }
                b bVar = NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime date = noteGroup.getDate();
                bVar.getClass();
                Long e11 = b.e(date);
                if (e11 == null) {
                    fVar.g2(8);
                } else {
                    fVar.v(8, e11.longValue());
                }
                b bVar2 = NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime serverCreatedDate = noteGroup.getServerCreatedDate();
                bVar2.getClass();
                Long e12 = b.e(serverCreatedDate);
                if (e12 == null) {
                    fVar.g2(9);
                } else {
                    fVar.v(9, e12.longValue());
                }
                b bVar3 = NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime serverModifiedDate = noteGroup.getServerModifiedDate();
                bVar3.getClass();
                Long e13 = b.e(serverModifiedDate);
                if (e13 == null) {
                    fVar.g2(10);
                } else {
                    fVar.v(10, e13.longValue());
                }
                b bVar4 = NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime localModifiedDate = noteGroup.getLocalModifiedDate();
                bVar4.getClass();
                Long e14 = b.e(localModifiedDate);
                if (e14 == null) {
                    fVar.g2(11);
                } else {
                    fVar.v(11, e14.longValue());
                }
                fVar.v(12, noteGroup.getNoSymptom() ? 1L : 0L);
                if (noteGroup.getSignalId() == null) {
                    fVar.g2(13);
                } else {
                    fVar.v(13, noteGroup.getSignalId().longValue());
                }
                fVar.v(14, noteGroup.getDeleted() ? 1L : 0L);
                fVar.v(15, noteGroup.getSynced() ? 1L : 0L);
                fVar.v(16, noteGroup.getNoteGroupId());
            }
        };
        this.__updateAdapterOfNoteEntityAsRoomNote = new j<NoteEntity>(roomDatabase) { // from class: com.withings.note.model.NoteGroupDao_RoomDb_Impl.5
            @Override // androidx.room.j, androidx.room.h0
            protected String createQuery() {
                return "UPDATE OR ABORT `NoteEntity` SET `noteId` = ?,`noteWsId` = ?,`noteGroupId` = ?,`localNoteGroupId` = ?,`noteDeleted` = ?,`type` = ?,`text` = ?,`noteHealthAttributeId` = ?,`noteHealthAttributeLocalId` = ?,`signalId` = ?,`modified` = ? WHERE `noteId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.j
            public void bind(f fVar, NoteEntity noteEntity) {
                fVar.v(1, noteEntity.getNoteId());
                if (noteEntity.getNoteWsId() == null) {
                    fVar.g2(2);
                } else {
                    fVar.v(2, noteEntity.getNoteWsId().longValue());
                }
                if (noteEntity.getNoteGroupId() == null) {
                    fVar.g2(3);
                } else {
                    fVar.v(3, noteEntity.getNoteGroupId().longValue());
                }
                if (noteEntity.getLocalNoteGroupId() == null) {
                    fVar.g2(4);
                } else {
                    fVar.v(4, noteEntity.getLocalNoteGroupId().longValue());
                }
                fVar.v(5, noteEntity.getNoteDeleted() ? 1L : 0L);
                fVar.v(6, noteEntity.getType());
                if (noteEntity.getText() == null) {
                    fVar.g2(7);
                } else {
                    fVar.s(7, noteEntity.getText());
                }
                if (noteEntity.getNoteHealthAttributeId() == null) {
                    fVar.g2(8);
                } else {
                    fVar.v(8, noteEntity.getNoteHealthAttributeId().longValue());
                }
                if (noteEntity.getNoteHealthAttributeLocalId() == null) {
                    fVar.g2(9);
                } else {
                    fVar.v(9, noteEntity.getNoteHealthAttributeLocalId().longValue());
                }
                if (noteEntity.getSignalId() == null) {
                    fVar.g2(10);
                } else {
                    fVar.v(10, noteEntity.getSignalId().longValue());
                }
                fVar.v(11, noteEntity.getModified());
                fVar.v(12, noteEntity.getNoteId());
            }
        };
        this.__preparedStmtOfUpdateSignalId = new h0(roomDatabase) { // from class: com.withings.note.model.NoteGroupDao_RoomDb_Impl.6
            @Override // androidx.room.h0
            public String createQuery() {
                return "UPDATE NoteEntity SET signalId = ? WHERE localNoteGroupId= ?";
            }
        };
        this.__preparedStmtOfDeleteNote = new h0(roomDatabase) { // from class: com.withings.note.model.NoteGroupDao_RoomDb_Impl.7
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM NoteEntity WHERE noteId = ?";
            }
        };
        this.__preparedStmtOfDeleteAllNotesForNotegroupId = new h0(roomDatabase) { // from class: com.withings.note.model.NoteGroupDao_RoomDb_Impl.8
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM NoteEntity WHERE localNoteGroupId = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new h0(roomDatabase) { // from class: com.withings.note.model.NoteGroupDao_RoomDb_Impl.9
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM NoteGroup";
            }
        };
        this.__preparedStmtOfDeleteAllNotes = new h0(roomDatabase) { // from class: com.withings.note.model.NoteGroupDao_RoomDb_Impl.10
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM NoteEntity";
            }
        };
        this.__preparedStmtOfUpdateNoteGroupsWithMeasureIds = new h0(roomDatabase) { // from class: com.withings.note.model.NoteGroupDao_RoomDb_Impl.11
            @Override // androidx.room.h0
            public String createQuery() {
                return "UPDATE NoteGroup SET remoteMeasureGroupId = ? WHERE localMeasureGroupId= ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.withings.note.model.NoteGroupDao
    public void deleteAll() {
        this.__db.b();
        f acquire = this.__preparedStmtOfDeleteAll.acquire();
        try {
            this.__db.c();
            acquire.H();
            this.__db.z();
            this.__db.h();
        } finally {
            this.__preparedStmtOfDeleteAll.release(acquire);
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public void deleteAllNotes() {
        this.__db.b();
        f acquire = this.__preparedStmtOfDeleteAllNotes.acquire();
        try {
            this.__db.c();
            acquire.H();
            this.__db.z();
            this.__db.h();
        } finally {
            this.__preparedStmtOfDeleteAllNotes.release(acquire);
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public void deleteAllNotesForNotegroupId(long j5) {
        this.__db.b();
        f acquire = this.__preparedStmtOfDeleteAllNotesForNotegroupId.acquire();
        acquire.v(1, j5);
        try {
            this.__db.c();
            acquire.H();
            this.__db.z();
            this.__db.h();
        } finally {
            this.__preparedStmtOfDeleteAllNotesForNotegroupId.release(acquire);
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public void deleteNote(long j5) {
        this.__db.b();
        f acquire = this.__preparedStmtOfDeleteNote.acquire();
        acquire.v(1, j5);
        try {
            this.__db.c();
            acquire.H();
            this.__db.z();
            this.__db.h();
        } finally {
            this.__preparedStmtOfDeleteNote.release(acquire);
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public void deleteNoteGroup(NoteGroup noteGroup) {
        this.__db.b();
        this.__db.c();
        try {
            this.__deletionAdapterOfNoteGroupAsRoomNoteGroup.handle(noteGroup);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public List<NoteEntity> getAllDeletedNotes() {
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        boolean z5;
        String string;
        Long valueOf4;
        Long valueOf5;
        Long valueOf6;
        d0 c11 = d0.c(0, "SELECT * FROM NoteEntity WHERE noteDeleted");
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "noteId");
            int b11 = a.b(c12, "noteWsId");
            int b12 = a.b(c12, "noteGroupId");
            int b13 = a.b(c12, "localNoteGroupId");
            int b14 = a.b(c12, "noteDeleted");
            int b15 = a.b(c12, "type");
            int b16 = a.b(c12, "text");
            int b17 = a.b(c12, "noteHealthAttributeId");
            int b18 = a.b(c12, "noteHealthAttributeLocalId");
            int b19 = a.b(c12, "signalId");
            int b21 = a.b(c12, "modified");
            ArrayList arrayList = new ArrayList(c12.getCount());
            while (c12.moveToNext()) {
                long j5 = c12.getLong(b10);
                if (c12.isNull(b11)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(c12.getLong(b11));
                }
                if (c12.isNull(b12)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(c12.getLong(b12));
                }
                if (c12.isNull(b13)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(c12.getLong(b13));
                }
                if (c12.getInt(b14) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int i11 = c12.getInt(b15);
                if (c12.isNull(b16)) {
                    string = null;
                } else {
                    string = c12.getString(b16);
                }
                if (c12.isNull(b17)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(c12.getLong(b17));
                }
                if (c12.isNull(b18)) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Long.valueOf(c12.getLong(b18));
                }
                if (c12.isNull(b19)) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Long.valueOf(c12.getLong(b19));
                }
                arrayList.add(new NoteEntity(j5, valueOf, valueOf2, valueOf3, z5, i11, string, valueOf4, valueOf5, valueOf6, c12.getLong(b21)));
            }
            return arrayList;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public List<NoteEntity> getAllNotes() {
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        boolean z5;
        String string;
        Long valueOf4;
        Long valueOf5;
        Long valueOf6;
        d0 c11 = d0.c(0, "SELECT * FROM NoteEntity");
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "noteId");
            int b11 = a.b(c12, "noteWsId");
            int b12 = a.b(c12, "noteGroupId");
            int b13 = a.b(c12, "localNoteGroupId");
            int b14 = a.b(c12, "noteDeleted");
            int b15 = a.b(c12, "type");
            int b16 = a.b(c12, "text");
            int b17 = a.b(c12, "noteHealthAttributeId");
            int b18 = a.b(c12, "noteHealthAttributeLocalId");
            int b19 = a.b(c12, "signalId");
            int b21 = a.b(c12, "modified");
            ArrayList arrayList = new ArrayList(c12.getCount());
            while (c12.moveToNext()) {
                long j5 = c12.getLong(b10);
                if (c12.isNull(b11)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(c12.getLong(b11));
                }
                if (c12.isNull(b12)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(c12.getLong(b12));
                }
                if (c12.isNull(b13)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(c12.getLong(b13));
                }
                if (c12.getInt(b14) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int i11 = c12.getInt(b15);
                if (c12.isNull(b16)) {
                    string = null;
                } else {
                    string = c12.getString(b16);
                }
                if (c12.isNull(b17)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(c12.getLong(b17));
                }
                if (c12.isNull(b18)) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Long.valueOf(c12.getLong(b18));
                }
                if (c12.isNull(b19)) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Long.valueOf(c12.getLong(b19));
                }
                arrayList.add(new NoteEntity(j5, valueOf, valueOf2, valueOf3, z5, i11, string, valueOf4, valueOf5, valueOf6, c12.getLong(b21)));
            }
            return arrayList;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public NoteGroup getById(long j5) {
        d0 d0Var;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        String string;
        Long valueOf5;
        Long valueOf6;
        Long valueOf7;
        Long valueOf8;
        boolean z5;
        boolean z11;
        boolean z12;
        d0 c11 = d0.c(1, "SELECT * from NoteGroup where noteGroupId = ?");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "noteGroupId");
            int b11 = a.b(c12, "wsId");
            int b12 = a.b(c12, NavigationArguments.USER_ID);
            int b13 = a.b(c12, "remoteMeasureGroupId");
            int b14 = a.b(c12, "localMeasureGroupId");
            int b15 = a.b(c12, "localEcgId");
            int b16 = a.b(c12, "cryptpart");
            int b17 = a.b(c12, "date");
            int b18 = a.b(c12, "serverCreatedDate");
            int b19 = a.b(c12, "serverModifiedDate");
            int b21 = a.b(c12, "localModifiedDate");
            int b22 = a.b(c12, "noSymptom");
            int b23 = a.b(c12, "signalId");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "deleted");
                int b25 = a.b(c12, "synced");
                NoteGroup noteGroup = null;
                Long valueOf9 = null;
                if (c12.moveToFirst()) {
                    NoteGroup noteGroup2 = new NoteGroup();
                    noteGroup2.setNoteGroupId(c12.getLong(b10));
                    if (c12.isNull(b11)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c12.getLong(b11));
                    }
                    noteGroup2.setWsId(valueOf);
                    if (c12.isNull(b12)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(c12.getLong(b12));
                    }
                    noteGroup2.setUserId(valueOf2);
                    noteGroup2.setRemoteMeasureGroupId(c12.getLong(b13));
                    if (c12.isNull(b14)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(c12.getLong(b14));
                    }
                    noteGroup2.setLocalMeasureGroupId(valueOf3);
                    if (c12.isNull(b15)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(c12.getLong(b15));
                    }
                    noteGroup2.setLocalHeartSignalMeasurementId(valueOf4);
                    if (c12.isNull(b16)) {
                        string = null;
                    } else {
                        string = c12.getString(b16);
                    }
                    noteGroup2.setCryptpart(string);
                    if (c12.isNull(b17)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(c12.getLong(b17));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf5);
                    if (a11 != null) {
                        noteGroup2.setDate(a11);
                        if (c12.isNull(b18)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Long.valueOf(c12.getLong(b18));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup2.setServerCreatedDate(b.a(valueOf6));
                        if (c12.isNull(b19)) {
                            valueOf7 = null;
                        } else {
                            valueOf7 = Long.valueOf(c12.getLong(b19));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup2.setServerModifiedDate(b.a(valueOf7));
                        if (c12.isNull(b21)) {
                            valueOf8 = null;
                        } else {
                            valueOf8 = Long.valueOf(c12.getLong(b21));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup2.setLocalModifiedDate(b.a(valueOf8));
                        if (c12.getInt(b22) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        noteGroup2.setNoSymptom(z5);
                        if (!c12.isNull(b23)) {
                            valueOf9 = Long.valueOf(c12.getLong(b23));
                        }
                        noteGroup2.setSignalId(valueOf9);
                        if (c12.getInt(b24) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        noteGroup2.setDeleted(z11);
                        if (c12.getInt(b25) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        noteGroup2.setSynced(z12);
                        noteGroup = noteGroup2;
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                c12.close();
                d0Var.release();
                return noteGroup;
            } catch (Throwable th2) {
                th = th2;
                c12.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d0Var = c11;
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public long getLastUpdate(long j5) {
        long j11;
        d0 c11 = d0.c(1, "SELECT MAX(localModifiedDate) from NoteGroup where userId= ?");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            if (c12.moveToFirst()) {
                j11 = c12.getLong(0);
            } else {
                j11 = 0;
            }
            return j11;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public NoteGroup getLocalBySignalId(long j5) {
        d0 d0Var;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        String string;
        Long valueOf5;
        Long valueOf6;
        Long valueOf7;
        Long valueOf8;
        boolean z5;
        boolean z11;
        boolean z12;
        d0 c11 = d0.c(1, "SELECT * FROM NoteGroup where localEcgId = ? AND Not deleted");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "noteGroupId");
            int b11 = a.b(c12, "wsId");
            int b12 = a.b(c12, NavigationArguments.USER_ID);
            int b13 = a.b(c12, "remoteMeasureGroupId");
            int b14 = a.b(c12, "localMeasureGroupId");
            int b15 = a.b(c12, "localEcgId");
            int b16 = a.b(c12, "cryptpart");
            int b17 = a.b(c12, "date");
            int b18 = a.b(c12, "serverCreatedDate");
            int b19 = a.b(c12, "serverModifiedDate");
            int b21 = a.b(c12, "localModifiedDate");
            int b22 = a.b(c12, "noSymptom");
            int b23 = a.b(c12, "signalId");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "deleted");
                int b25 = a.b(c12, "synced");
                NoteGroup noteGroup = null;
                Long valueOf9 = null;
                if (c12.moveToFirst()) {
                    NoteGroup noteGroup2 = new NoteGroup();
                    noteGroup2.setNoteGroupId(c12.getLong(b10));
                    if (c12.isNull(b11)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c12.getLong(b11));
                    }
                    noteGroup2.setWsId(valueOf);
                    if (c12.isNull(b12)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(c12.getLong(b12));
                    }
                    noteGroup2.setUserId(valueOf2);
                    noteGroup2.setRemoteMeasureGroupId(c12.getLong(b13));
                    if (c12.isNull(b14)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(c12.getLong(b14));
                    }
                    noteGroup2.setLocalMeasureGroupId(valueOf3);
                    if (c12.isNull(b15)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(c12.getLong(b15));
                    }
                    noteGroup2.setLocalHeartSignalMeasurementId(valueOf4);
                    if (c12.isNull(b16)) {
                        string = null;
                    } else {
                        string = c12.getString(b16);
                    }
                    noteGroup2.setCryptpart(string);
                    if (c12.isNull(b17)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(c12.getLong(b17));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf5);
                    if (a11 != null) {
                        noteGroup2.setDate(a11);
                        if (c12.isNull(b18)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Long.valueOf(c12.getLong(b18));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup2.setServerCreatedDate(b.a(valueOf6));
                        if (c12.isNull(b19)) {
                            valueOf7 = null;
                        } else {
                            valueOf7 = Long.valueOf(c12.getLong(b19));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup2.setServerModifiedDate(b.a(valueOf7));
                        if (c12.isNull(b21)) {
                            valueOf8 = null;
                        } else {
                            valueOf8 = Long.valueOf(c12.getLong(b21));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup2.setLocalModifiedDate(b.a(valueOf8));
                        if (c12.getInt(b22) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        noteGroup2.setNoSymptom(z5);
                        if (!c12.isNull(b23)) {
                            valueOf9 = Long.valueOf(c12.getLong(b23));
                        }
                        noteGroup2.setSignalId(valueOf9);
                        if (c12.getInt(b24) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        noteGroup2.setDeleted(z11);
                        if (c12.getInt(b25) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        noteGroup2.setSynced(z12);
                        noteGroup = noteGroup2;
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                c12.close();
                d0Var.release();
                return noteGroup;
            } catch (Throwable th2) {
                th = th2;
                c12.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d0Var = c11;
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public LiveData<NoteGroup> getLocalLiveDataBySignalId(long j5) {
        final d0 c11 = d0.c(1, "SELECT * FROM NoteGroup where localEcgId = ? AND Not deleted");
        c11.v(1, j5);
        return this.__db.l().c(new String[]{"NoteGroup"}, new Callable<NoteGroup>() { // from class: com.withings.note.model.NoteGroupDao_RoomDb_Impl.12
            protected void finalize() {
                c11.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public NoteGroup call() throws Exception {
                Cursor c12 = x8.b.c(NoteGroupDao_RoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "noteGroupId");
                    int b11 = a.b(c12, "wsId");
                    int b12 = a.b(c12, NavigationArguments.USER_ID);
                    int b13 = a.b(c12, "remoteMeasureGroupId");
                    int b14 = a.b(c12, "localMeasureGroupId");
                    int b15 = a.b(c12, "localEcgId");
                    int b16 = a.b(c12, "cryptpart");
                    int b17 = a.b(c12, "date");
                    int b18 = a.b(c12, "serverCreatedDate");
                    int b19 = a.b(c12, "serverModifiedDate");
                    int b21 = a.b(c12, "localModifiedDate");
                    int b22 = a.b(c12, "noSymptom");
                    int b23 = a.b(c12, "signalId");
                    int b24 = a.b(c12, "deleted");
                    int b25 = a.b(c12, "synced");
                    NoteGroup noteGroup = null;
                    if (c12.moveToFirst()) {
                        NoteGroup noteGroup2 = new NoteGroup();
                        noteGroup2.setNoteGroupId(c12.getLong(b10));
                        noteGroup2.setWsId(c12.isNull(b11) ? null : Long.valueOf(c12.getLong(b11)));
                        noteGroup2.setUserId(c12.isNull(b12) ? null : Long.valueOf(c12.getLong(b12)));
                        noteGroup2.setRemoteMeasureGroupId(c12.getLong(b13));
                        noteGroup2.setLocalMeasureGroupId(c12.isNull(b14) ? null : Long.valueOf(c12.getLong(b14)));
                        noteGroup2.setLocalHeartSignalMeasurementId(c12.isNull(b15) ? null : Long.valueOf(c12.getLong(b15)));
                        noteGroup2.setCryptpart(c12.isNull(b16) ? null : c12.getString(b16));
                        Long valueOf = c12.isNull(b17) ? null : Long.valueOf(c12.getLong(b17));
                        NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(valueOf);
                        if (a11 != null) {
                            noteGroup2.setDate(a11);
                            Long valueOf2 = c12.isNull(b18) ? null : Long.valueOf(c12.getLong(b18));
                            NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                            noteGroup2.setServerCreatedDate(b.a(valueOf2));
                            Long valueOf3 = c12.isNull(b19) ? null : Long.valueOf(c12.getLong(b19));
                            NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                            noteGroup2.setServerModifiedDate(b.a(valueOf3));
                            Long valueOf4 = c12.isNull(b21) ? null : Long.valueOf(c12.getLong(b21));
                            NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                            noteGroup2.setLocalModifiedDate(b.a(valueOf4));
                            boolean z5 = true;
                            noteGroup2.setNoSymptom(c12.getInt(b22) != 0);
                            noteGroup2.setSignalId(c12.isNull(b23) ? null : Long.valueOf(c12.getLong(b23)));
                            noteGroup2.setDeleted(c12.getInt(b24) != 0);
                            if (c12.getInt(b25) == 0) {
                                z5 = false;
                            }
                            noteGroup2.setSynced(z5);
                            noteGroup = noteGroup2;
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c12.close();
                    return noteGroup;
                } catch (Throwable th2) {
                    c12.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.note.model.NoteGroupDao
    public List<NoteGroup> getNotDeletedGroupsForUserAndType(long j5, int i11) {
        d0 d0Var;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        String string;
        Long valueOf5;
        Long valueOf6;
        Long valueOf7;
        Long valueOf8;
        int i12;
        boolean z5;
        Long valueOf9;
        boolean z11;
        boolean z12;
        d0 c11 = d0.c(2, "SELECT NoteGroup.* FROM NoteGroup JOIN NoteEntity on NoteGroup.noteGroupId = NoteEntity.localNoteGroupId WHERE NoteEntity.type = ?\n        AND userId = ? AND Not deleted");
        c11.v(1, i11);
        c11.v(2, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "noteGroupId");
            int b11 = a.b(c12, "wsId");
            int b12 = a.b(c12, NavigationArguments.USER_ID);
            int b13 = a.b(c12, "remoteMeasureGroupId");
            int b14 = a.b(c12, "localMeasureGroupId");
            int b15 = a.b(c12, "localEcgId");
            int b16 = a.b(c12, "cryptpart");
            int b17 = a.b(c12, "date");
            int b18 = a.b(c12, "serverCreatedDate");
            int b19 = a.b(c12, "serverModifiedDate");
            int b21 = a.b(c12, "localModifiedDate");
            int b22 = a.b(c12, "noSymptom");
            int b23 = a.b(c12, "signalId");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "deleted");
                int b25 = a.b(c12, "synced");
                int i13 = b23;
                ArrayList arrayList = new ArrayList(c12.getCount());
                while (c12.moveToNext()) {
                    NoteGroup noteGroup = new NoteGroup();
                    int i14 = b19;
                    int i15 = b21;
                    noteGroup.setNoteGroupId(c12.getLong(b10));
                    if (c12.isNull(b11)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c12.getLong(b11));
                    }
                    noteGroup.setWsId(valueOf);
                    if (c12.isNull(b12)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(c12.getLong(b12));
                    }
                    noteGroup.setUserId(valueOf2);
                    int i16 = b10;
                    int i17 = b11;
                    noteGroup.setRemoteMeasureGroupId(c12.getLong(b13));
                    if (c12.isNull(b14)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(c12.getLong(b14));
                    }
                    noteGroup.setLocalMeasureGroupId(valueOf3);
                    if (c12.isNull(b15)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(c12.getLong(b15));
                    }
                    noteGroup.setLocalHeartSignalMeasurementId(valueOf4);
                    if (c12.isNull(b16)) {
                        string = null;
                    } else {
                        string = c12.getString(b16);
                    }
                    noteGroup.setCryptpart(string);
                    if (c12.isNull(b17)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(c12.getLong(b17));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf5);
                    if (a11 != null) {
                        noteGroup.setDate(a11);
                        if (c12.isNull(b18)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Long.valueOf(c12.getLong(b18));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup.setServerCreatedDate(b.a(valueOf6));
                        if (c12.isNull(i14)) {
                            valueOf7 = null;
                        } else {
                            valueOf7 = Long.valueOf(c12.getLong(i14));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup.setServerModifiedDate(b.a(valueOf7));
                        if (c12.isNull(i15)) {
                            i12 = i14;
                            valueOf8 = null;
                        } else {
                            valueOf8 = Long.valueOf(c12.getLong(i15));
                            i12 = i14;
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup.setLocalModifiedDate(b.a(valueOf8));
                        if (c12.getInt(b22) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        noteGroup.setNoSymptom(z5);
                        int i18 = i13;
                        if (c12.isNull(i18)) {
                            valueOf9 = null;
                        } else {
                            valueOf9 = Long.valueOf(c12.getLong(i18));
                        }
                        noteGroup.setSignalId(valueOf9);
                        int i19 = b24;
                        int i21 = b22;
                        if (c12.getInt(i19) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        noteGroup.setDeleted(z11);
                        int i22 = b25;
                        if (c12.getInt(i22) != 0) {
                            b25 = i22;
                            z12 = true;
                        } else {
                            b25 = i22;
                            z12 = false;
                        }
                        noteGroup.setSynced(z12);
                        arrayList.add(noteGroup);
                        b22 = i21;
                        i13 = i18;
                        b10 = i16;
                        b24 = i19;
                        b19 = i12;
                        b21 = i15;
                        b11 = i17;
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                c12.close();
                d0Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                c12.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d0Var = c11;
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public List<NoteEntity> getNotDeletedNotesFromNoteGroupId(long j5) {
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        boolean z5;
        String string;
        Long valueOf4;
        Long valueOf5;
        Long valueOf6;
        d0 c11 = d0.c(1, "SELECT * FROM NoteEntity WHERE localNoteGroupId = ? And Not noteDeleted");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "noteId");
            int b11 = a.b(c12, "noteWsId");
            int b12 = a.b(c12, "noteGroupId");
            int b13 = a.b(c12, "localNoteGroupId");
            int b14 = a.b(c12, "noteDeleted");
            int b15 = a.b(c12, "type");
            int b16 = a.b(c12, "text");
            int b17 = a.b(c12, "noteHealthAttributeId");
            int b18 = a.b(c12, "noteHealthAttributeLocalId");
            int b19 = a.b(c12, "signalId");
            int b21 = a.b(c12, "modified");
            ArrayList arrayList = new ArrayList(c12.getCount());
            while (c12.moveToNext()) {
                long j11 = c12.getLong(b10);
                if (c12.isNull(b11)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(c12.getLong(b11));
                }
                if (c12.isNull(b12)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(c12.getLong(b12));
                }
                if (c12.isNull(b13)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(c12.getLong(b13));
                }
                if (c12.getInt(b14) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int i11 = c12.getInt(b15);
                if (c12.isNull(b16)) {
                    string = null;
                } else {
                    string = c12.getString(b16);
                }
                if (c12.isNull(b17)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(c12.getLong(b17));
                }
                if (c12.isNull(b18)) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Long.valueOf(c12.getLong(b18));
                }
                if (c12.isNull(b19)) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Long.valueOf(c12.getLong(b19));
                }
                arrayList.add(new NoteEntity(j11, valueOf, valueOf2, valueOf3, z5, i11, string, valueOf4, valueOf5, valueOf6, c12.getLong(b21)));
            }
            return arrayList;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public List<NoteGroup> getNotSyncedGroupsForUser(long j5) {
        d0 d0Var;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        String string;
        Long valueOf5;
        Long valueOf6;
        Long valueOf7;
        Long valueOf8;
        boolean z5;
        int i11;
        Long valueOf9;
        boolean z11;
        boolean z12;
        d0 c11 = d0.c(1, "SELECT * from NoteGroup where userId =? AND Not synced");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "noteGroupId");
            int b11 = a.b(c12, "wsId");
            int b12 = a.b(c12, NavigationArguments.USER_ID);
            int b13 = a.b(c12, "remoteMeasureGroupId");
            int b14 = a.b(c12, "localMeasureGroupId");
            int b15 = a.b(c12, "localEcgId");
            int b16 = a.b(c12, "cryptpart");
            int b17 = a.b(c12, "date");
            int b18 = a.b(c12, "serverCreatedDate");
            int b19 = a.b(c12, "serverModifiedDate");
            int b21 = a.b(c12, "localModifiedDate");
            int b22 = a.b(c12, "noSymptom");
            int b23 = a.b(c12, "signalId");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "deleted");
                int b25 = a.b(c12, "synced");
                int i12 = b23;
                ArrayList arrayList = new ArrayList(c12.getCount());
                while (c12.moveToNext()) {
                    NoteGroup noteGroup = new NoteGroup();
                    int i13 = b22;
                    ArrayList arrayList2 = arrayList;
                    noteGroup.setNoteGroupId(c12.getLong(b10));
                    if (c12.isNull(b11)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c12.getLong(b11));
                    }
                    noteGroup.setWsId(valueOf);
                    if (c12.isNull(b12)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(c12.getLong(b12));
                    }
                    noteGroup.setUserId(valueOf2);
                    noteGroup.setRemoteMeasureGroupId(c12.getLong(b13));
                    if (c12.isNull(b14)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(c12.getLong(b14));
                    }
                    noteGroup.setLocalMeasureGroupId(valueOf3);
                    if (c12.isNull(b15)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(c12.getLong(b15));
                    }
                    noteGroup.setLocalHeartSignalMeasurementId(valueOf4);
                    if (c12.isNull(b16)) {
                        string = null;
                    } else {
                        string = c12.getString(b16);
                    }
                    noteGroup.setCryptpart(string);
                    if (c12.isNull(b17)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(c12.getLong(b17));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf5);
                    if (a11 != null) {
                        noteGroup.setDate(a11);
                        if (c12.isNull(b18)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Long.valueOf(c12.getLong(b18));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup.setServerCreatedDate(b.a(valueOf6));
                        if (c12.isNull(b19)) {
                            valueOf7 = null;
                        } else {
                            valueOf7 = Long.valueOf(c12.getLong(b19));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup.setServerModifiedDate(b.a(valueOf7));
                        if (c12.isNull(b21)) {
                            valueOf8 = null;
                        } else {
                            valueOf8 = Long.valueOf(c12.getLong(b21));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup.setLocalModifiedDate(b.a(valueOf8));
                        b22 = i13;
                        if (c12.getInt(b22) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        noteGroup.setNoSymptom(z5);
                        int i14 = i12;
                        if (c12.isNull(i14)) {
                            i11 = b10;
                            valueOf9 = null;
                        } else {
                            i11 = b10;
                            valueOf9 = Long.valueOf(c12.getLong(i14));
                        }
                        noteGroup.setSignalId(valueOf9);
                        int i15 = b24;
                        b24 = i15;
                        if (c12.getInt(i15) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        noteGroup.setDeleted(z11);
                        int i16 = b25;
                        if (c12.getInt(i16) != 0) {
                            b25 = i16;
                            z12 = true;
                        } else {
                            b25 = i16;
                            z12 = false;
                        }
                        noteGroup.setSynced(z12);
                        arrayList2.add(noteGroup);
                        i12 = i14;
                        arrayList = arrayList2;
                        b10 = i11;
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                ArrayList arrayList3 = arrayList;
                c12.close();
                d0Var.release();
                return arrayList3;
            } catch (Throwable th2) {
                th = th2;
                c12.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d0Var = c11;
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public List<NoteGroup> getNoteGroupForMeasureGroupDbId(long j5) {
        d0 d0Var;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        String string;
        Long valueOf5;
        Long valueOf6;
        Long valueOf7;
        Long valueOf8;
        boolean z5;
        int i11;
        Long valueOf9;
        boolean z11;
        boolean z12;
        d0 c11 = d0.c(1, "SELECT * FROM NoteGroup WHERE localMeasureGroupId = ?");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "noteGroupId");
            int b11 = a.b(c12, "wsId");
            int b12 = a.b(c12, NavigationArguments.USER_ID);
            int b13 = a.b(c12, "remoteMeasureGroupId");
            int b14 = a.b(c12, "localMeasureGroupId");
            int b15 = a.b(c12, "localEcgId");
            int b16 = a.b(c12, "cryptpart");
            int b17 = a.b(c12, "date");
            int b18 = a.b(c12, "serverCreatedDate");
            int b19 = a.b(c12, "serverModifiedDate");
            int b21 = a.b(c12, "localModifiedDate");
            int b22 = a.b(c12, "noSymptom");
            int b23 = a.b(c12, "signalId");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "deleted");
                int b25 = a.b(c12, "synced");
                int i12 = b23;
                ArrayList arrayList = new ArrayList(c12.getCount());
                while (c12.moveToNext()) {
                    NoteGroup noteGroup = new NoteGroup();
                    int i13 = b22;
                    ArrayList arrayList2 = arrayList;
                    noteGroup.setNoteGroupId(c12.getLong(b10));
                    if (c12.isNull(b11)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c12.getLong(b11));
                    }
                    noteGroup.setWsId(valueOf);
                    if (c12.isNull(b12)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(c12.getLong(b12));
                    }
                    noteGroup.setUserId(valueOf2);
                    noteGroup.setRemoteMeasureGroupId(c12.getLong(b13));
                    if (c12.isNull(b14)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(c12.getLong(b14));
                    }
                    noteGroup.setLocalMeasureGroupId(valueOf3);
                    if (c12.isNull(b15)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(c12.getLong(b15));
                    }
                    noteGroup.setLocalHeartSignalMeasurementId(valueOf4);
                    if (c12.isNull(b16)) {
                        string = null;
                    } else {
                        string = c12.getString(b16);
                    }
                    noteGroup.setCryptpart(string);
                    if (c12.isNull(b17)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(c12.getLong(b17));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf5);
                    if (a11 != null) {
                        noteGroup.setDate(a11);
                        if (c12.isNull(b18)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Long.valueOf(c12.getLong(b18));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup.setServerCreatedDate(b.a(valueOf6));
                        if (c12.isNull(b19)) {
                            valueOf7 = null;
                        } else {
                            valueOf7 = Long.valueOf(c12.getLong(b19));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup.setServerModifiedDate(b.a(valueOf7));
                        if (c12.isNull(b21)) {
                            valueOf8 = null;
                        } else {
                            valueOf8 = Long.valueOf(c12.getLong(b21));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup.setLocalModifiedDate(b.a(valueOf8));
                        b22 = i13;
                        if (c12.getInt(b22) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        noteGroup.setNoSymptom(z5);
                        int i14 = i12;
                        if (c12.isNull(i14)) {
                            i11 = b10;
                            valueOf9 = null;
                        } else {
                            i11 = b10;
                            valueOf9 = Long.valueOf(c12.getLong(i14));
                        }
                        noteGroup.setSignalId(valueOf9);
                        int i15 = b24;
                        b24 = i15;
                        if (c12.getInt(i15) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        noteGroup.setDeleted(z11);
                        int i16 = b25;
                        if (c12.getInt(i16) != 0) {
                            b25 = i16;
                            z12 = true;
                        } else {
                            b25 = i16;
                            z12 = false;
                        }
                        noteGroup.setSynced(z12);
                        arrayList2.add(noteGroup);
                        i12 = i14;
                        arrayList = arrayList2;
                        b10 = i11;
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                ArrayList arrayList3 = arrayList;
                c12.close();
                d0Var.release();
                return arrayList3;
            } catch (Throwable th2) {
                th = th2;
                c12.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d0Var = c11;
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public List<NoteGroup> getNoteGroupForMeasureGroupWsId(long j5) {
        d0 d0Var;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        String string;
        Long valueOf5;
        Long valueOf6;
        Long valueOf7;
        Long valueOf8;
        boolean z5;
        int i11;
        Long valueOf9;
        boolean z11;
        boolean z12;
        d0 c11 = d0.c(1, "SELECT * FROM NoteGroup WHERE remoteMeasureGroupId = ?");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "noteGroupId");
            int b11 = a.b(c12, "wsId");
            int b12 = a.b(c12, NavigationArguments.USER_ID);
            int b13 = a.b(c12, "remoteMeasureGroupId");
            int b14 = a.b(c12, "localMeasureGroupId");
            int b15 = a.b(c12, "localEcgId");
            int b16 = a.b(c12, "cryptpart");
            int b17 = a.b(c12, "date");
            int b18 = a.b(c12, "serverCreatedDate");
            int b19 = a.b(c12, "serverModifiedDate");
            int b21 = a.b(c12, "localModifiedDate");
            int b22 = a.b(c12, "noSymptom");
            int b23 = a.b(c12, "signalId");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "deleted");
                int b25 = a.b(c12, "synced");
                int i12 = b23;
                ArrayList arrayList = new ArrayList(c12.getCount());
                while (c12.moveToNext()) {
                    NoteGroup noteGroup = new NoteGroup();
                    int i13 = b22;
                    ArrayList arrayList2 = arrayList;
                    noteGroup.setNoteGroupId(c12.getLong(b10));
                    if (c12.isNull(b11)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c12.getLong(b11));
                    }
                    noteGroup.setWsId(valueOf);
                    if (c12.isNull(b12)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(c12.getLong(b12));
                    }
                    noteGroup.setUserId(valueOf2);
                    noteGroup.setRemoteMeasureGroupId(c12.getLong(b13));
                    if (c12.isNull(b14)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(c12.getLong(b14));
                    }
                    noteGroup.setLocalMeasureGroupId(valueOf3);
                    if (c12.isNull(b15)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(c12.getLong(b15));
                    }
                    noteGroup.setLocalHeartSignalMeasurementId(valueOf4);
                    if (c12.isNull(b16)) {
                        string = null;
                    } else {
                        string = c12.getString(b16);
                    }
                    noteGroup.setCryptpart(string);
                    if (c12.isNull(b17)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(c12.getLong(b17));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf5);
                    if (a11 != null) {
                        noteGroup.setDate(a11);
                        if (c12.isNull(b18)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Long.valueOf(c12.getLong(b18));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup.setServerCreatedDate(b.a(valueOf6));
                        if (c12.isNull(b19)) {
                            valueOf7 = null;
                        } else {
                            valueOf7 = Long.valueOf(c12.getLong(b19));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup.setServerModifiedDate(b.a(valueOf7));
                        if (c12.isNull(b21)) {
                            valueOf8 = null;
                        } else {
                            valueOf8 = Long.valueOf(c12.getLong(b21));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup.setLocalModifiedDate(b.a(valueOf8));
                        b22 = i13;
                        if (c12.getInt(b22) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        noteGroup.setNoSymptom(z5);
                        int i14 = i12;
                        if (c12.isNull(i14)) {
                            i11 = b10;
                            valueOf9 = null;
                        } else {
                            i11 = b10;
                            valueOf9 = Long.valueOf(c12.getLong(i14));
                        }
                        noteGroup.setSignalId(valueOf9);
                        int i15 = b24;
                        b24 = i15;
                        if (c12.getInt(i15) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        noteGroup.setDeleted(z11);
                        int i16 = b25;
                        if (c12.getInt(i16) != 0) {
                            b25 = i16;
                            z12 = true;
                        } else {
                            b25 = i16;
                            z12 = false;
                        }
                        noteGroup.setSynced(z12);
                        arrayList2.add(noteGroup);
                        i12 = i14;
                        arrayList = arrayList2;
                        b10 = i11;
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                ArrayList arrayList3 = arrayList;
                c12.close();
                d0Var.release();
                return arrayList3;
            } catch (Throwable th2) {
                th = th2;
                c12.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d0Var = c11;
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public NoteGroup getNoteGroupForWsId(long j5) {
        d0 d0Var;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        String string;
        Long valueOf5;
        Long valueOf6;
        Long valueOf7;
        Long valueOf8;
        boolean z5;
        boolean z11;
        boolean z12;
        d0 c11 = d0.c(1, "SELECT * FROM NoteGroup WHERE wsId = ?");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "noteGroupId");
            int b11 = a.b(c12, "wsId");
            int b12 = a.b(c12, NavigationArguments.USER_ID);
            int b13 = a.b(c12, "remoteMeasureGroupId");
            int b14 = a.b(c12, "localMeasureGroupId");
            int b15 = a.b(c12, "localEcgId");
            int b16 = a.b(c12, "cryptpart");
            int b17 = a.b(c12, "date");
            int b18 = a.b(c12, "serverCreatedDate");
            int b19 = a.b(c12, "serverModifiedDate");
            int b21 = a.b(c12, "localModifiedDate");
            int b22 = a.b(c12, "noSymptom");
            int b23 = a.b(c12, "signalId");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "deleted");
                int b25 = a.b(c12, "synced");
                NoteGroup noteGroup = null;
                Long valueOf9 = null;
                if (c12.moveToFirst()) {
                    NoteGroup noteGroup2 = new NoteGroup();
                    noteGroup2.setNoteGroupId(c12.getLong(b10));
                    if (c12.isNull(b11)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c12.getLong(b11));
                    }
                    noteGroup2.setWsId(valueOf);
                    if (c12.isNull(b12)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(c12.getLong(b12));
                    }
                    noteGroup2.setUserId(valueOf2);
                    noteGroup2.setRemoteMeasureGroupId(c12.getLong(b13));
                    if (c12.isNull(b14)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(c12.getLong(b14));
                    }
                    noteGroup2.setLocalMeasureGroupId(valueOf3);
                    if (c12.isNull(b15)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(c12.getLong(b15));
                    }
                    noteGroup2.setLocalHeartSignalMeasurementId(valueOf4);
                    if (c12.isNull(b16)) {
                        string = null;
                    } else {
                        string = c12.getString(b16);
                    }
                    noteGroup2.setCryptpart(string);
                    if (c12.isNull(b17)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(c12.getLong(b17));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf5);
                    if (a11 != null) {
                        noteGroup2.setDate(a11);
                        if (c12.isNull(b18)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Long.valueOf(c12.getLong(b18));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup2.setServerCreatedDate(b.a(valueOf6));
                        if (c12.isNull(b19)) {
                            valueOf7 = null;
                        } else {
                            valueOf7 = Long.valueOf(c12.getLong(b19));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup2.setServerModifiedDate(b.a(valueOf7));
                        if (c12.isNull(b21)) {
                            valueOf8 = null;
                        } else {
                            valueOf8 = Long.valueOf(c12.getLong(b21));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup2.setLocalModifiedDate(b.a(valueOf8));
                        if (c12.getInt(b22) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        noteGroup2.setNoSymptom(z5);
                        if (!c12.isNull(b23)) {
                            valueOf9 = Long.valueOf(c12.getLong(b23));
                        }
                        noteGroup2.setSignalId(valueOf9);
                        if (c12.getInt(b24) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        noteGroup2.setDeleted(z11);
                        if (c12.getInt(b25) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        noteGroup2.setSynced(z12);
                        noteGroup = noteGroup2;
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                c12.close();
                d0Var.release();
                return noteGroup;
            } catch (Throwable th2) {
                th = th2;
                c12.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d0Var = c11;
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public LiveData<List<NoteGroup>> getNoteGroupLiveDataForMeasureGroupDbId(long j5) {
        final d0 c11 = d0.c(1, "SELECT * FROM NoteGroup WHERE localMeasureGroupId = ? AND Not deleted");
        c11.v(1, j5);
        return this.__db.l().c(new String[]{"NoteGroup"}, new Callable<List<NoteGroup>>() { // from class: com.withings.note.model.NoteGroupDao_RoomDb_Impl.15
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<NoteGroup> call() throws Exception {
                int i11;
                Long valueOf;
                boolean z5;
                boolean z11;
                Cursor c12 = x8.b.c(NoteGroupDao_RoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "noteGroupId");
                    int b11 = a.b(c12, "wsId");
                    int b12 = a.b(c12, NavigationArguments.USER_ID);
                    int b13 = a.b(c12, "remoteMeasureGroupId");
                    int b14 = a.b(c12, "localMeasureGroupId");
                    int b15 = a.b(c12, "localEcgId");
                    int b16 = a.b(c12, "cryptpart");
                    int b17 = a.b(c12, "date");
                    int b18 = a.b(c12, "serverCreatedDate");
                    int b19 = a.b(c12, "serverModifiedDate");
                    int b21 = a.b(c12, "localModifiedDate");
                    int b22 = a.b(c12, "noSymptom");
                    int b23 = a.b(c12, "signalId");
                    int b24 = a.b(c12, "deleted");
                    int b25 = a.b(c12, "synced");
                    int i12 = b23;
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        NoteGroup noteGroup = new NoteGroup();
                        int i13 = b21;
                        int i14 = b22;
                        noteGroup.setNoteGroupId(c12.getLong(b10));
                        noteGroup.setWsId(c12.isNull(b11) ? null : Long.valueOf(c12.getLong(b11)));
                        noteGroup.setUserId(c12.isNull(b12) ? null : Long.valueOf(c12.getLong(b12)));
                        int i15 = b11;
                        int i16 = b12;
                        noteGroup.setRemoteMeasureGroupId(c12.getLong(b13));
                        noteGroup.setLocalMeasureGroupId(c12.isNull(b14) ? null : Long.valueOf(c12.getLong(b14)));
                        noteGroup.setLocalHeartSignalMeasurementId(c12.isNull(b15) ? null : Long.valueOf(c12.getLong(b15)));
                        noteGroup.setCryptpart(c12.isNull(b16) ? null : c12.getString(b16));
                        Long valueOf2 = c12.isNull(b17) ? null : Long.valueOf(c12.getLong(b17));
                        NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(valueOf2);
                        if (a11 != null) {
                            noteGroup.setDate(a11);
                            Long valueOf3 = c12.isNull(b18) ? null : Long.valueOf(c12.getLong(b18));
                            NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                            noteGroup.setServerCreatedDate(b.a(valueOf3));
                            Long valueOf4 = c12.isNull(b19) ? null : Long.valueOf(c12.getLong(b19));
                            NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                            noteGroup.setServerModifiedDate(b.a(valueOf4));
                            Long valueOf5 = c12.isNull(i13) ? null : Long.valueOf(c12.getLong(i13));
                            NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                            noteGroup.setLocalModifiedDate(b.a(valueOf5));
                            noteGroup.setNoSymptom(c12.getInt(i14) != 0);
                            int i17 = i12;
                            if (c12.isNull(i17)) {
                                i11 = b10;
                                valueOf = null;
                            } else {
                                i11 = b10;
                                valueOf = Long.valueOf(c12.getLong(i17));
                            }
                            noteGroup.setSignalId(valueOf);
                            int i18 = b24;
                            if (c12.getInt(i18) != 0) {
                                b24 = i18;
                                z5 = true;
                            } else {
                                b24 = i18;
                                z5 = false;
                            }
                            noteGroup.setDeleted(z5);
                            int i19 = b25;
                            if (c12.getInt(i19) != 0) {
                                b25 = i19;
                                z11 = true;
                            } else {
                                b25 = i19;
                                z11 = false;
                            }
                            noteGroup.setSynced(z11);
                            arrayList.add(noteGroup);
                            i12 = i17;
                            b10 = i11;
                            b22 = i14;
                            b12 = i16;
                            b21 = i13;
                            b11 = i15;
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c12.close();
                    return arrayList;
                } catch (Throwable th2) {
                    c12.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.note.model.NoteGroupDao
    public LiveData<List<NoteGroup>> getNoteGroupLiveDataForMeasureGroupWsId(long j5) {
        final d0 c11 = d0.c(1, "SELECT * FROM NoteGroup WHERE remoteMeasureGroupId = ? AND Not deleted");
        c11.v(1, j5);
        return this.__db.l().c(new String[]{"NoteGroup"}, new Callable<List<NoteGroup>>() { // from class: com.withings.note.model.NoteGroupDao_RoomDb_Impl.14
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<NoteGroup> call() throws Exception {
                int i11;
                Long valueOf;
                boolean z5;
                boolean z11;
                Cursor c12 = x8.b.c(NoteGroupDao_RoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "noteGroupId");
                    int b11 = a.b(c12, "wsId");
                    int b12 = a.b(c12, NavigationArguments.USER_ID);
                    int b13 = a.b(c12, "remoteMeasureGroupId");
                    int b14 = a.b(c12, "localMeasureGroupId");
                    int b15 = a.b(c12, "localEcgId");
                    int b16 = a.b(c12, "cryptpart");
                    int b17 = a.b(c12, "date");
                    int b18 = a.b(c12, "serverCreatedDate");
                    int b19 = a.b(c12, "serverModifiedDate");
                    int b21 = a.b(c12, "localModifiedDate");
                    int b22 = a.b(c12, "noSymptom");
                    int b23 = a.b(c12, "signalId");
                    int b24 = a.b(c12, "deleted");
                    int b25 = a.b(c12, "synced");
                    int i12 = b23;
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        NoteGroup noteGroup = new NoteGroup();
                        int i13 = b21;
                        int i14 = b22;
                        noteGroup.setNoteGroupId(c12.getLong(b10));
                        noteGroup.setWsId(c12.isNull(b11) ? null : Long.valueOf(c12.getLong(b11)));
                        noteGroup.setUserId(c12.isNull(b12) ? null : Long.valueOf(c12.getLong(b12)));
                        int i15 = b11;
                        int i16 = b12;
                        noteGroup.setRemoteMeasureGroupId(c12.getLong(b13));
                        noteGroup.setLocalMeasureGroupId(c12.isNull(b14) ? null : Long.valueOf(c12.getLong(b14)));
                        noteGroup.setLocalHeartSignalMeasurementId(c12.isNull(b15) ? null : Long.valueOf(c12.getLong(b15)));
                        noteGroup.setCryptpart(c12.isNull(b16) ? null : c12.getString(b16));
                        Long valueOf2 = c12.isNull(b17) ? null : Long.valueOf(c12.getLong(b17));
                        NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(valueOf2);
                        if (a11 != null) {
                            noteGroup.setDate(a11);
                            Long valueOf3 = c12.isNull(b18) ? null : Long.valueOf(c12.getLong(b18));
                            NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                            noteGroup.setServerCreatedDate(b.a(valueOf3));
                            Long valueOf4 = c12.isNull(b19) ? null : Long.valueOf(c12.getLong(b19));
                            NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                            noteGroup.setServerModifiedDate(b.a(valueOf4));
                            Long valueOf5 = c12.isNull(i13) ? null : Long.valueOf(c12.getLong(i13));
                            NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                            noteGroup.setLocalModifiedDate(b.a(valueOf5));
                            noteGroup.setNoSymptom(c12.getInt(i14) != 0);
                            int i17 = i12;
                            if (c12.isNull(i17)) {
                                i11 = b10;
                                valueOf = null;
                            } else {
                                i11 = b10;
                                valueOf = Long.valueOf(c12.getLong(i17));
                            }
                            noteGroup.setSignalId(valueOf);
                            int i18 = b24;
                            if (c12.getInt(i18) != 0) {
                                b24 = i18;
                                z5 = true;
                            } else {
                                b24 = i18;
                                z5 = false;
                            }
                            noteGroup.setDeleted(z5);
                            int i19 = b25;
                            if (c12.getInt(i19) != 0) {
                                b25 = i19;
                                z11 = true;
                            } else {
                                b25 = i19;
                                z11 = false;
                            }
                            noteGroup.setSynced(z11);
                            arrayList.add(noteGroup);
                            i12 = i17;
                            b10 = i11;
                            b22 = i14;
                            b12 = i16;
                            b21 = i13;
                            b11 = i15;
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c12.close();
                    return arrayList;
                } catch (Throwable th2) {
                    c12.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.note.model.NoteGroupDao
    public List<NoteEntity> getNotesFromNoteGroupId(long j5) {
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        boolean z5;
        String string;
        Long valueOf4;
        Long valueOf5;
        Long valueOf6;
        d0 c11 = d0.c(1, "SELECT * FROM NoteEntity WHERE localNoteGroupId = ?");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "noteId");
            int b11 = a.b(c12, "noteWsId");
            int b12 = a.b(c12, "noteGroupId");
            int b13 = a.b(c12, "localNoteGroupId");
            int b14 = a.b(c12, "noteDeleted");
            int b15 = a.b(c12, "type");
            int b16 = a.b(c12, "text");
            int b17 = a.b(c12, "noteHealthAttributeId");
            int b18 = a.b(c12, "noteHealthAttributeLocalId");
            int b19 = a.b(c12, "signalId");
            int b21 = a.b(c12, "modified");
            ArrayList arrayList = new ArrayList(c12.getCount());
            while (c12.moveToNext()) {
                long j11 = c12.getLong(b10);
                if (c12.isNull(b11)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(c12.getLong(b11));
                }
                if (c12.isNull(b12)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(c12.getLong(b12));
                }
                if (c12.isNull(b13)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(c12.getLong(b13));
                }
                if (c12.getInt(b14) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int i11 = c12.getInt(b15);
                if (c12.isNull(b16)) {
                    string = null;
                } else {
                    string = c12.getString(b16);
                }
                if (c12.isNull(b17)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(c12.getLong(b17));
                }
                if (c12.isNull(b18)) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Long.valueOf(c12.getLong(b18));
                }
                if (c12.isNull(b19)) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Long.valueOf(c12.getLong(b19));
                }
                arrayList.add(new NoteEntity(j11, valueOf, valueOf2, valueOf3, z5, i11, string, valueOf4, valueOf5, valueOf6, c12.getLong(b21)));
            }
            return arrayList;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public NoteGroup getRemoteBySignalId(long j5) {
        d0 d0Var;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        String string;
        Long valueOf5;
        Long valueOf6;
        Long valueOf7;
        Long valueOf8;
        boolean z5;
        boolean z11;
        boolean z12;
        d0 c11 = d0.c(1, "SELECT * FROM NoteGroup WHERE signalId = ?");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "noteGroupId");
            int b11 = a.b(c12, "wsId");
            int b12 = a.b(c12, NavigationArguments.USER_ID);
            int b13 = a.b(c12, "remoteMeasureGroupId");
            int b14 = a.b(c12, "localMeasureGroupId");
            int b15 = a.b(c12, "localEcgId");
            int b16 = a.b(c12, "cryptpart");
            int b17 = a.b(c12, "date");
            int b18 = a.b(c12, "serverCreatedDate");
            int b19 = a.b(c12, "serverModifiedDate");
            int b21 = a.b(c12, "localModifiedDate");
            int b22 = a.b(c12, "noSymptom");
            int b23 = a.b(c12, "signalId");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "deleted");
                int b25 = a.b(c12, "synced");
                NoteGroup noteGroup = null;
                Long valueOf9 = null;
                if (c12.moveToFirst()) {
                    NoteGroup noteGroup2 = new NoteGroup();
                    noteGroup2.setNoteGroupId(c12.getLong(b10));
                    if (c12.isNull(b11)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c12.getLong(b11));
                    }
                    noteGroup2.setWsId(valueOf);
                    if (c12.isNull(b12)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(c12.getLong(b12));
                    }
                    noteGroup2.setUserId(valueOf2);
                    noteGroup2.setRemoteMeasureGroupId(c12.getLong(b13));
                    if (c12.isNull(b14)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(c12.getLong(b14));
                    }
                    noteGroup2.setLocalMeasureGroupId(valueOf3);
                    if (c12.isNull(b15)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(c12.getLong(b15));
                    }
                    noteGroup2.setLocalHeartSignalMeasurementId(valueOf4);
                    if (c12.isNull(b16)) {
                        string = null;
                    } else {
                        string = c12.getString(b16);
                    }
                    noteGroup2.setCryptpart(string);
                    if (c12.isNull(b17)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(c12.getLong(b17));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf5);
                    if (a11 != null) {
                        noteGroup2.setDate(a11);
                        if (c12.isNull(b18)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Long.valueOf(c12.getLong(b18));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup2.setServerCreatedDate(b.a(valueOf6));
                        if (c12.isNull(b19)) {
                            valueOf7 = null;
                        } else {
                            valueOf7 = Long.valueOf(c12.getLong(b19));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup2.setServerModifiedDate(b.a(valueOf7));
                        if (c12.isNull(b21)) {
                            valueOf8 = null;
                        } else {
                            valueOf8 = Long.valueOf(c12.getLong(b21));
                        }
                        this.__commonRoomConverter.getClass();
                        noteGroup2.setLocalModifiedDate(b.a(valueOf8));
                        if (c12.getInt(b22) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        noteGroup2.setNoSymptom(z5);
                        if (!c12.isNull(b23)) {
                            valueOf9 = Long.valueOf(c12.getLong(b23));
                        }
                        noteGroup2.setSignalId(valueOf9);
                        if (c12.getInt(b24) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        noteGroup2.setDeleted(z11);
                        if (c12.getInt(b25) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        noteGroup2.setSynced(z12);
                        noteGroup = noteGroup2;
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                c12.close();
                d0Var.release();
                return noteGroup;
            } catch (Throwable th2) {
                th = th2;
                c12.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d0Var = c11;
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public LiveData<NoteGroup> getRemoteLiveDataBySignalId(long j5) {
        final d0 c11 = d0.c(1, "SELECT * FROM NoteGroup WHERE signalId = ?");
        c11.v(1, j5);
        return this.__db.l().c(new String[]{"NoteGroup"}, new Callable<NoteGroup>() { // from class: com.withings.note.model.NoteGroupDao_RoomDb_Impl.13
            protected void finalize() {
                c11.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public NoteGroup call() throws Exception {
                Cursor c12 = x8.b.c(NoteGroupDao_RoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "noteGroupId");
                    int b11 = a.b(c12, "wsId");
                    int b12 = a.b(c12, NavigationArguments.USER_ID);
                    int b13 = a.b(c12, "remoteMeasureGroupId");
                    int b14 = a.b(c12, "localMeasureGroupId");
                    int b15 = a.b(c12, "localEcgId");
                    int b16 = a.b(c12, "cryptpart");
                    int b17 = a.b(c12, "date");
                    int b18 = a.b(c12, "serverCreatedDate");
                    int b19 = a.b(c12, "serverModifiedDate");
                    int b21 = a.b(c12, "localModifiedDate");
                    int b22 = a.b(c12, "noSymptom");
                    int b23 = a.b(c12, "signalId");
                    int b24 = a.b(c12, "deleted");
                    int b25 = a.b(c12, "synced");
                    NoteGroup noteGroup = null;
                    if (c12.moveToFirst()) {
                        NoteGroup noteGroup2 = new NoteGroup();
                        noteGroup2.setNoteGroupId(c12.getLong(b10));
                        noteGroup2.setWsId(c12.isNull(b11) ? null : Long.valueOf(c12.getLong(b11)));
                        noteGroup2.setUserId(c12.isNull(b12) ? null : Long.valueOf(c12.getLong(b12)));
                        noteGroup2.setRemoteMeasureGroupId(c12.getLong(b13));
                        noteGroup2.setLocalMeasureGroupId(c12.isNull(b14) ? null : Long.valueOf(c12.getLong(b14)));
                        noteGroup2.setLocalHeartSignalMeasurementId(c12.isNull(b15) ? null : Long.valueOf(c12.getLong(b15)));
                        noteGroup2.setCryptpart(c12.isNull(b16) ? null : c12.getString(b16));
                        Long valueOf = c12.isNull(b17) ? null : Long.valueOf(c12.getLong(b17));
                        NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(valueOf);
                        if (a11 != null) {
                            noteGroup2.setDate(a11);
                            Long valueOf2 = c12.isNull(b18) ? null : Long.valueOf(c12.getLong(b18));
                            NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                            noteGroup2.setServerCreatedDate(b.a(valueOf2));
                            Long valueOf3 = c12.isNull(b19) ? null : Long.valueOf(c12.getLong(b19));
                            NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                            noteGroup2.setServerModifiedDate(b.a(valueOf3));
                            Long valueOf4 = c12.isNull(b21) ? null : Long.valueOf(c12.getLong(b21));
                            NoteGroupDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                            noteGroup2.setLocalModifiedDate(b.a(valueOf4));
                            boolean z5 = true;
                            noteGroup2.setNoSymptom(c12.getInt(b22) != 0);
                            noteGroup2.setSignalId(c12.isNull(b23) ? null : Long.valueOf(c12.getLong(b23)));
                            noteGroup2.setDeleted(c12.getInt(b24) != 0);
                            if (c12.getInt(b25) == 0) {
                                z5 = false;
                            }
                            noteGroup2.setSynced(z5);
                            noteGroup = noteGroup2;
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c12.close();
                    return noteGroup;
                } catch (Throwable th2) {
                    c12.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.note.model.NoteGroupDao
    public long insertOrUpdate(NoteGroup noteGroup) {
        this.__db.b();
        this.__db.c();
        try {
            long insertAndReturnId = this.__insertionAdapterOfNoteGroupAsRoomNoteGroup.insertAndReturnId(noteGroup);
            this.__db.z();
            return insertAndReturnId;
        } finally {
            this.__db.h();
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public void update(NoteGroup noteGroup) {
        this.__db.b();
        this.__db.c();
        try {
            this.__updateAdapterOfNoteGroupAsRoomNoteGroup.handle(noteGroup);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public void updateNoteGroupsWithMeasureIds(long j5, long j11) {
        this.__db.b();
        f acquire = this.__preparedStmtOfUpdateNoteGroupsWithMeasureIds.acquire();
        acquire.v(1, j5);
        acquire.v(2, j11);
        try {
            this.__db.c();
            acquire.H();
            this.__db.z();
            this.__db.h();
        } finally {
            this.__preparedStmtOfUpdateNoteGroupsWithMeasureIds.release(acquire);
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public void updateSignalId(long j5, long j11) {
        this.__db.b();
        f acquire = this.__preparedStmtOfUpdateSignalId.acquire();
        acquire.v(1, j5);
        acquire.v(2, j11);
        try {
            this.__db.c();
            acquire.H();
            this.__db.z();
            this.__db.h();
        } finally {
            this.__preparedStmtOfUpdateSignalId.release(acquire);
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public void insertOrUpdate(NoteEntity noteEntity) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfNoteEntityAsRoomNote.insert((k<NoteEntity>) noteEntity);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }

    @Override // com.withings.note.model.NoteGroupDao
    public void update(NoteEntity noteEntity) {
        this.__db.b();
        this.__db.c();
        try {
            this.__updateAdapterOfNoteEntityAsRoomNote.handle(noteEntity);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }
}
