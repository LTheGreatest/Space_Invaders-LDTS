package SpaceInvaders.Viewer.Game

import SpaceInvaders.GUI.GUI
import SpaceInvaders.Model.Game.Collectables.DamageCollectable
import SpaceInvaders.Model.Game.Collectables.GodModeCollectable
import SpaceInvaders.Model.Game.Collectables.HealthCollectable
import SpaceInvaders.Model.Game.Collectables.MachineGunModeCollectable
import SpaceInvaders.Model.Game.Collectables.ScoreCollectable
import SpaceInvaders.Model.Position
import SpaceInvaders.Viewer.Game.Collectables.DamageCollectableViewer
import SpaceInvaders.Viewer.Game.Collectables.GodModeCollectableViewer
import SpaceInvaders.Viewer.Game.Collectables.HealthCollectableViewer
import SpaceInvaders.Viewer.Game.Collectables.MachineGunCollectableViewer
import SpaceInvaders.Viewer.Game.Collectables.ScoreCollectableViewer
import spock.lang.Specification

class CollectableViewerTests extends Specification{

    def "GodModeCollectableViewer draw"(){
        given:
            def CollectableViewer = new GodModeCollectableViewer()
            def gui = Mock(GUI)
            def collectable = new GodModeCollectable(Mock(Position))
        when:
            CollectableViewer.draw(gui,collectable)
        then:
           1 * gui.drawElement(collectable.getPosition(), '\u0024', "#009000")

    }
    def "Health collectable draw"(){
        given:
            def CollectableViewer = new HealthCollectableViewer()
            def gui = Mock(GUI)
            def collectable = new HealthCollectable(Mock(Position))
        when:
            CollectableViewer.draw(gui, collectable)
        then:
            1 *  gui.drawElement(collectable.getPosition(), '\u00c1', "#ff0000")
    }

    def "MachineGun collectable draw"(){
        given:
            def CollectableViewer = new MachineGunCollectableViewer()
            def gui = Mock(GUI)
            def collectable = new MachineGunModeCollectable(Mock(Position))
        when:
            CollectableViewer.draw(gui, collectable)
        then:
            1 * gui.drawElement(collectable.getPosition(), '\u0024', "#009000");

    }

    def "Score collectable draw"(){
        given:
            def CollectableViewer = new ScoreCollectableViewer()
            def gui = Mock(GUI)
            def collectable = new ScoreCollectable(Mock(Position),0)
        when:
            CollectableViewer.draw(gui,collectable)
        then:
            1 * gui.drawElement(collectable.getPosition(), '\u0024', "#009000");
    }

    def "Damage collectable draw"(){
        given:
            def CollectableViewer = new DamageCollectableViewer()
            def gui = Mock(GUI)
            def collectable = new DamageCollectable(Mock(Position),0)
        when:
            CollectableViewer.draw(gui, collectable)
        then:
            1 * gui.drawElement(collectable.getPosition(),'\u0024', "#009000")
    }

}

