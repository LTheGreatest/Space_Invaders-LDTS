package SpaceInvaders.source_code.Viewer.Menu;

import SpaceInvaders.source_code.GUI.GUI;
import SpaceInvaders.source_code.Model.Menu.Leaderboard;
import SpaceInvaders.source_code.Model.Position;

public class LeaderboardViewer extends OnlyTextMenuViewer<Leaderboard> {
    public LeaderboardViewer(Leaderboard menu){
        super(menu, new Position());
    }

    @Override
    protected void drawElements(GUI gui) {
        super.drawElements(gui);
        super.drawMenuTitle(gui, "LEADERBOARD", colorTitle, new Position());
    }


    @Override
    protected void drawFileText(GUI gui) {
        for(int i = 0; i < 5; i++){
            if(i < getModel().getText().size()) {
                gui.drawText(new Position(getReference_x(), getReference_y() + 1), getModel().getText().get(i), color);
            }
        }
    }
}
