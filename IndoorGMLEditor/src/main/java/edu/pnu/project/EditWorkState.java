package edu.pnu.project;

import java.io.Serializable;

public enum EditWorkState implements Serializable {
	NONE,
	CREATE_INTERLAYERCONNECTION_SELECTEND1,
	CREATE_INTERLAYERCONNECTION_SELECTEND2,
	CREATE_INTERLAYERCONNECTION_CREATE,
	CREATE_CELLSPACE_POINT1,
	CREATE_CELLSPACE_POINT2,
	CREATE_CELLSPACE_POINT3,
	CREATE_CELLSPACE_NEXTPOINT,
	CREATE_CELLSPACE_SELECT
}
