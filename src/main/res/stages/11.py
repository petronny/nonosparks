import json
stage='11'
data={}
data['width']=10
data['height']=10
data['name']='Reindeer'
data['hints']={}
data['hints']['horizontal']=['2','1 1 2','1 1 1 1','1 1 1','2 3','2 2 1','1 6','1 1 3','1 1 1','2']
data['hints']['vertical']=['1 1 1','3 1','1 2','2 2','1 1 1','3 2','5 1','3 3','2 1 1','1 1']
data['answer']=[]
data['answer'].append([0,0,1,0,1,0,1,0,0,0])
data['answer'].append([0,0,0,1,1,1,0,1,0,0])
data['answer'].append([0,1,0,0,0,1,1,0,0,0])
data['answer'].append([0,0,1,1,0,0,1,1,0,0])
data['answer'].append([0,1,0,0,1,0,1,0,0,0])
data['answer'].append([0,0,0,0,1,1,1,0,1,1])
data['answer'].append([0,0,0,1,1,1,1,1,0,1])
data['answer'].append([1,1,1,0,0,0,1,1,1,0])
data['answer'].append([1,1,0,0,0,1,0,1,0,0])
data['answer'].append([0,0,1,0,0,0,0,0,1,0])

json.dump(data,open(stage+'.json','w'),sort_keys=True)
