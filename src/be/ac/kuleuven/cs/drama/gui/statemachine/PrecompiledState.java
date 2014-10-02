/**
 *
 * CVS: $Header: /export/home0/cvsroot/socsg/DRAMA/Sources/be/ac/kuleuven/cs/drama/gui/statemachine/PrecompiledState.java,v 1.1.1.1 2001/09/07 09:41:38 dirkw Exp $
 *
 * (C) 2000
 * Katholieke Universiteit Leuven
 * Developed at Dept. Computer Science
 *
 */
package be.ac.kuleuven.cs.drama.gui.statemachine;

/**
 * State indicating that the program text is precompiled.
 *
 * @version 0.8.0 09/06/2000
 * @author  Tom Schrijvers
 */

class PrecompiledState

   extends GuiState {
   PrecompiledState(GuiStateMachine stateMachine) {
      super(stateMachine);
   }

   void initActionStates() {
      getStateMachine().setExecuteActionsEnabled(false);
   }

   void newFile() {
      getStateMachine().realNewFile();
      getStateMachine().setCurrentState(getStateMachine().getSavedState());
   }

   void saveFile() {
      // NOTHING NECESSARY
   }








   void openFile() {
      try {
         getStateMachine().realOpenFile();
         getStateMachine().setCurrentState(getStateMachine().getSavedState());
      } catch (CancelException ce) {
         getStateMachine().statusMessage("Openen geanulleerd.");
      }

   }

   void precompile() {
      // NOTHING NECESSARY
   }








   void compile() {
      try {
         getStateMachine().realCompile();
         getStateMachine().setCurrentState(getStateMachine().getCompiledState());
      } catch (CancelException ce) {
         getStateMachine().statusMessage("Compilatie niet geslaagd.");
      }

   }

}