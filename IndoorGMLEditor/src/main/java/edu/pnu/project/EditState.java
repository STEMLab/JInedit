package edu.pnu.project;

import java.io.Serializable;

public enum EditState implements Serializable {
	NONE,
	BottomLeftPoint, TopRightPoint,
	SELECT_STATE, CREATE_STATE, MOVE_STATE,
	SELECT_TRANSITION, CREATE_TRANSITION, MOVE_TRANSITION,
	CREATE_INTERLAYERCONNECTION, SELECT_INTERLAYERCONNECTION,
	CREATE_CELLSPACE, SELECT_CELLSPACE, MOVE_CELLSPACE,
	SELECT_CELLSPACEBOUNDARY,
	CREATE_STATE_DUALITY, CREATE_CELLSPACE_DUALITY, CREATE_TRANSITION_DUALITY, CREATE_CELLSPACEBOUNDARY_DUALITY,
	CREATE_CELLSPACEBOUNDARY_AS_DOOR, SELECT_CELLSPACEBOUNDARY_AS_DOOR,
	CREATE_CELLSPACE_AS_DOOR, SELECT_CELLSPACE_AS_DOOR
}
